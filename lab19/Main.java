public class Main
{
    /**
     * This application generates an html page that displays different colors.
     */
    public static void main(String args[])
    {
        Color149 cc1;
        Color149 cc2;
        Color149 cc3;
        Color149 cc4;
        Color149 cc5;
        Color149 cc6;
        Color149 cc7;
        Color149 cc8;
        Color149 cc9;
        
        System.out.printf("<html><pre>\n");
        
        out("color BLACK", Color149.BLACK);
        out("color RED", Color149.RED);
        out("color GREEN", Color149.GREEN);
        out("color YELLOW", Color149.YELLOW);
        out("color BLUE", Color149.BLUE);
        out("color MAGENTA", Color149.MAGENTA);
        out("color CYAN", Color149.CYAN);
        out("color WHITE", Color149.WHITE);
        System.out.printf("\n");
        
        out("color RED+GREEN", Color149.RED.add(Color149.GREEN));
        out("color RED+YELLOW", Color149.RED.add(Color149.YELLOW));
        out("color WHITE-CYAN", Color149.WHITE.sub(Color149.CYAN));
        System.out.printf("\n");
        
        cc1 = new Color149(34, 54, 189);
        out("color cc1{34,54,189}", cc1);
        cc2 = new Color149(128, 32, 64);
        out("color cc2{128,32,64}", cc2);
        System.out.printf("\n");
        
        out("color dark BLUE", Color149.BLUE.darken());
        out("color dim BLUE", Color149.BLUE.dim());
        System.out.printf("\n");
        
        cc3 = Color149.BLUE;
        cc3 = cc3.add(Color149.GREEN);
        System.out.printf ("Does BLUE + GREEN == CYAN? %s\n",
                           String.valueOf(cc3.equals(Color149.CYAN)));
        System.out.printf("\n");
        
        cc4 = new Color149(0,64,0);
        out("color cc4{0,64,0}", cc4);
        for (int ii = 0; ii < 8; ii++)
        {
            cc4 = cc4.lighten();
            out("color lighten*" + ii + " {0,64,0}", cc4);
        }
        System.out.printf("\n");
        
        cc5 = new Color149(0,64,0);
        out("color cc5{0,64,0}", cc5);
        for (int ii = 0; ii < 8; ii++)
        {
            cc5 = cc5.brighten();
            out("color brighten*" + ii + " {0,64,0}", cc5);
        }
        System.out.printf("\n");
        
        cc6 = new Color149(255,192,0);
        out("color cc6{255,192,0}", cc6);
        for (int ii = 0; ii < 8; ii++)
        {
            cc6 = cc6.darken();
            out("color darken*" + ii + " {255,192,0}", cc6);
        }
        System.out.printf("\n");
        
        cc7 = new Color149(255,192,0);
        out("color cc7{255,192,0}", cc7);
        for (int ii = 0; ii < 8; ii++)
        {
            cc7 = cc7.dim();
            out("color dim*" + ii + " {255,192,0}", cc7);
        }
        System.out.printf("\n");
        
        System.out.printf("</html>\n");
    }
    
    /**
     * This method outputs HTML for a color's string and the color
     * itself along with a comment describing what the color is.
     */
    private static void out(String descript, Color149 theColor)
    {
        System.out.printf("%-30s is %s in hex and looks like this: "
                + "<span style=\"background-color:%s\">&nbsp; &nbsp;</span>\n",
                          descript, theColor.toString(), theColor.toString());
    }
    
}
