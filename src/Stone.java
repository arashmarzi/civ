import java.io.*;

public class Stone extends Resource {
   private String resType;

   public Stone() {
      super();
      resType = this.resTypes[2];
   }

   public String getResType() {
      return resType;
   }
}
