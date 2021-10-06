
class LabaOne {

  static final int ALEN = 20;
    static final int XLEN = 12;
    static final int ELEN = 12;
    static final int EHEIGHT = 20;

      public static void main(String[] args) {
          double[][] e = matrixFiller();

          arrayPrinter(e);
      }

      public static double randomiser() {
          return Math.random() * 24 - 10;
      }

      public static double cond1(double vmestox1) {
          return Math.asin(Math.sin(Math.pow(Math.asin((vmestox1+2d)/24d),0.5d*vmestox1)));
      }

      public static double cond2(double vmestox2) {
          return Math.pow(Math.atan(Math.cos(vmestox2)),2d*Math.tan((1/3d)/(vmestox2+1d)));
      }

      public static double cond3(double vmestox3) {
          return Math.cbrt(Math.pow(Math.cbrt(Math.pow(Math.E,vmestox3)),
                                    Math.pow(0.75d*Math.asin((vmestox3+2d)/24d),
                                             Math.pow((1/3d)*vmestox3/Math.PI,2))));
      }

      public static short[] fillArrayFromOneToLength(short[] massivForFill) {

          for (int anum = 0; anum < massivForFill.length ; anum++) {
              massivForFill[anum] = (short)(anum + 1);

          }
          return massivForFill;
      }

       public static double[][] matrixFiller(){
          double[][] metMatrix = new double [EHEIGHT][ELEN];
          short[] afiller = new short[ALEN];
          fillArrayFromOneToLength(afiller);
          double[] xfiller = new double[XLEN];

          for (int i = 0; i < xfiller.length; i++){
            xfiller[i] = randomiser();
          }

          for (int i = 0; i < metMatrix.length; i++){
              for (int j = 0; j < metMatrix[i].length; j++){
                  if (afiller[i] == 8) {
                      metMatrix[i][j] = cond1(xfiller[j]);
                  } else if (afiller[i] == 2 || afiller[i] == 3 || afiller[i] == 4 || afiller[i] == 5 ||
                             afiller[i] == 6 || afiller[i] == 9 || afiller[i] == 13 || afiller[i] == 15 ||
                             afiller[i] == 17 || afiller[i] == 20) {
                      metMatrix[i][j] = cond2(xfiller[j]);
                  } else {
                      metMatrix[i][j] = cond3(xfiller[j]);
                  }
              }
          }

          return metMatrix;
      }

      public static void arrayPrinter(double[][] earray){
          for (int i = 0; i < earray.length; i++){
              for (int j = 0; j < earray[i].length; j++){
                  System.out.printf("%.5f ", earray[i][j]);
              }
            System.out.println();
          }
      }

}
