        class LabaOne
        {
            public static void main(String[] args)
                {
                  short[] a;
                  a =new short[20];
                  for (int i = 0; i<20;i++)
                    {
                      a[i]= (short)(i+1);

                    }
                  double[] x;
                  x = new double [12];
                  for (int i = 0; i < 12; i++)
                    {
                      x[i] = (double)(Math.random()*24 -10);
                    }
                  double[][] e = new double [20][12];
                  for (int i = 0; i< 20; i++)
                    {
                      for(int j = 0; j<12;j++)
                        {
                          if(a[i]==8) e[i][j] = Math.asin(Math.sin(Math.pow(Math.asin((x[j]+2)/24),0.5*x[j])));
                          else if (a[i]==2|a[i]==3|a[i]==4|a[i]==5|a[i]==6|a[i]==9|a[i]==13|a[i]==15|a[i]==17|a[i]==20) e[i][j]= Math.pow(Math.atan(Math.cos(x[j])),2*Math.tan((1/3)/(x[j]+1)));
                          else e[i][j]= Math.cbrt(Math.pow(Math.cbrt(Math.pow(Math.E,x[j])),Math.pow(0.75*Math.asin((x[j]+2)/24),Math.pow((1/3)*x[j]/Math.PI,2))));

                        }
                    }
                    for ( int i = 0; i<20;i++)
                      {
                        for(int j=0;j<12;j++)
                          {
                            System.out.printf("%.5f", e[i][j]);
                            System.out.print(" ");
                          }
                          System.out.println();
                      }
                }
        }
