        class LabaOne
        {
            public static void main(String[] args)
                {
                  short[] a = new short[]{17,16,15,14,13,12,11,10,9,8,7,6,5,4,3};
                  //System.out.println(a[5]);
                  float[] x = new float[17];
                  for (int i = 0; i < x.length; i++)
                    {
                      x[i] = (float)(Math.random() * (3+14) -14);
                      //System.out.println(x[i]);
                    }
                    double[][] e = double[8][17];
                    for (int i = 0; i< 8; i++) {
                      for (int j = 0; j<17; j++)
                      {
                        if (a[i]==11)

                          e[i][j] = Math.pow((Math.asin(1/Math.pow(Math.E,Math.abs(x[j]))) * (Math.cbrt(Math.atan((x[j]-5.5)/17))-1)),Math.cbrt(Math.pow(x[j],x[j]/2)));
                          else if(a[i]==3|a[i]==5|a[i]==7|a[i]==17) e[i][j] = Math.tan(Math.atan(Math.pow((x[j]-5.5/17),2)));
                          else e[i][j] = 0,75/(4+ Math.cos(Math.pow(0,25+(x[j]-1)/x,2));
                      }
                    }
                    for (int i = 0; i< 8; i++)
                    {
                      for (int j = 0; j<17; j++)
                      {
                        System.out.printf("%.2f",e[i][j]);
                        System.out.print(" ";)
                      }
                      System.out.println();
                    }

                }
        }
