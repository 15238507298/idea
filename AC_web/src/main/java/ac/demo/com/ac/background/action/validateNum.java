package ac.demo.com.ac.background.action;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public class validateNum {
    public static void main(String[] args) {
//        validateNum va = new validateNum();
//        String[] con = va.productStrings();
//
//        va.drawImage(con);

    }
    public String[] productStrings(){
        Random r = new Random();
        String[] vc =new String[4];
        for(int i=0;i<4;){
            int v = r.nextInt(57);
            if(v>25&&v<32){
                continue;
            }
//            System.out.println(v);
            vc[i]=String.valueOf((char)(v+65));
            i++;
        }


        return vc;
    }
public ByteArrayOutputStream drawImage(String... ks){
    int x=120;
    int y=60;
    int color=255;
    BufferedImage bi = new BufferedImage(120, 60, BufferedImage.TYPE_INT_RGB);
    Graphics gra = bi.getGraphics();
    gra.setColor(Color.WHITE);
    gra.fillRect(0,0,120,60);
    Random r = new Random();
    for(int i=0;i<6;i++){
        gra.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        gra.drawLine(r.nextInt(x),r.nextInt(y),r.nextInt(x),r.nextInt(y));
    }
    int positionx=x/ks.length;
    for(int k=0;k<ks.length;k++){
        gra.setColor(new Color(r.nextInt(120),r.nextInt(120),r.nextInt(120)));
        gra.drawString(ks[k],positionx*k,30);
    }
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    try {
        java.io.File file=new java.io.File("/soft/aa.png");
        ImageIO.write(bi, "png",bo);


    } catch (IOException e) {
        e.printStackTrace();
    }
    return bo;
}
}
