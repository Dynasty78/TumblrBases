
package tumblr;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.User;


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

        
    }
    
}
