import java.io.*;

public class Wood extends Resource {
   private String resType;

   public Wood() {
      super();
      resType = this.resTypes[0];
   }

   public String getResType() {
      return resType;
   }
}
