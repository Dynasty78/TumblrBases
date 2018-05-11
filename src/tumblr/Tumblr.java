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
        
        int i = 0;
        int totalText = 0,
            totalVideo = 0, totalPhoto = 0, otro = 0, total;
        
       for(Post blogs : posts){   
    
                if(i == posts.size()-1){
                    parametro = blogs.getTimestamp();
                 }
                
                switch(blogs.getType()){
                   
                    case "text": totalText++;
                    break;
                    
                    case "photo": totalPhoto++;
                    break;
                    
                    case "video": totalVideo++;
                    break;
                    
                    default: otro++;
                       
                }
        
             i++;
       }
       
        while(true){
            System.out.println("Prueba");
            i = 0;
            params.put("before", parametro);
            posts = client.tagged("microwave meals",params);
            
            if(!posts.isEmpty()){
                 for(Post blogs : posts){   
    
        if(i == posts.size()-1){
            parametro = blogs.getTimestamp();
        }
        
         switch(blogs.getType()){
                   
                    case "text": totalText++;
                    break;
                    
                    case "photo": totalPhoto++;
                    break;
                    
                    case "video": totalVideo++;
                    break;
                    
                    default: otro++;
                       
                }
        i++;
       
       }
                
            }else{
                break;
            }
            
        }
        
        total = totalText + totalPhoto+ totalVideo+ otro;
        System.out.println(total);
  
    }
}
