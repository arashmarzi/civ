import java.io.*;

public class Metal extends Resource {
   private String resType;

   public Metal() {
      super();
      resType = this.resTypes[1];
   }

   public String getResType() {
      return resType;
   }
}
