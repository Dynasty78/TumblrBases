
package tumblr;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Post;
import com.tumblr.jumblr.types.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Tumblr {


    public static void main(String[] args) {
        // Authenticate via OAuth
        JumblrClient client = new JumblrClient(
          "6CJI5nYV1FtCLgLaVrEJBv5ciZMNIlCrHof5KNe4wRPXn2TEYH",
          "twEUONaIooBzP3w3FPkMTnHqWKw8AXTrHzPwI1HrqUyiQRM89u"
        );
        client.setToken(
          "ZXjLGeY2jceU8X8r2WRSxdCdf73u6NONaqhbwdVlWyIeYMmZ3q",
          "EBpBjNOfdjCVaKZTcSmfG7qds68zOonViDUxBMkycAsa7Gdgpe"
        );
        
        Long parametro = 0l;
        Map<String, Object> params = new HashMap<String, Object>();
       
        List<Post> posts = client.tagged("microwave meals");
        ArrayList<String> nombreBlogs = new ArrayList<String>();
        int i = 0;
        
        
       for(Post blogs : posts){   
    
        if(i == posts.size()-1){
            parametro = blogs.getTimestamp();
        }
        nombreBlogs.add(blogs.getBlogName());
        i++;
       
       }
       
        while(true){
            
            i = 0;
            params.put("before", parametro);
            posts = client.tagged("microwave meals",params);
            
            if(!posts.isEmpty()){
                 for(Post blogs : posts){   
    
        if(i == posts.size()-1){
            parametro = blogs.getTimestamp();
        }
        nombreBlogs.add(blogs.getBlogName());
        i++;
       
       }
                
            }else{
                break;
            }
            
            
        }
        System.out.println(nombreBlogs.size());
  
    }
}
