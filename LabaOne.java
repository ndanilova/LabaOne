        class LabaOne
        {
            public static void main(String[] args)
                {
                  final int ALEN = 20;
                  final int XLEN = 12;
                  final int ELEN =12;
                  final int EHEIGHT= 20;

                  short[] a;
                  a =new short[ALEN];
                  //a - массив 20 чисел по возрастанию [1;20]
                  for (int i = 0; i<ALEN;i++)
                    {
                      a[i]= (short)(i+1);

                    }
                  double[] x;
                  x = new double [XLEN];
                  //x - массив 12 ранд. чисел [-10;14]
                  for (int i = 0; i < XLEN; i++)
                    {
                      x[i] = randomiser(Math.random());
                    }
                  double[][] e = new double [EHEIGHT][ELEN];
                  //e - массив 20х12
                  for (int i = 0; i< EHEIGHT; i++)
                    {
                      for(int j = 0; j<ELEN;j++)
                        {
                          if(a[i]==8) e[i][j] = cond1(x[j]);
                          else if (a[i]==2||a[i]==3||a[i]==4||a[i]==5||a[i]==6||a[i]==9||a[i]==13||a[i]==15||a[i]==17||a[i]==20) e[i][j]= cond2(x[j]);
                          else e[i][j]= cond3(x[j]);

                        }
                    }
                    for ( int i = 0; i<EHEIGHT;i++)
                      {
                        for(int j=0;j<ELEN;j++)
                          {
                            System.out.printf("%.5f", e[i][j]);
                            System.out.print(" ");
                          }
                          System.out.println();
                      }
                }
                public static double randomiser(double rand){
                   rand = (Math.random()*24 -10);
                   return rand;

                }
                public static double cond1(double vmestox1){
                  return Math.asin(Math.sin(Math.pow(Math.asin((vmestox1+2)/24),0.5*vmestox1)));
                }
                public static double cond2(double vmestox2){
                  return Math.pow(Math.atan(Math.cos(vmestox2)),2*Math.tan((1/3d)/(vmestox2+1)));
                }
                public static double cond3(double vmestox3) {
                  return Math.cbrt(Math.pow(Math.cbrt(Math.pow(Math.E,vmestox3)),Math.pow(0.75*Math.asin((vmestox3+2)/24),Math.pow((1/3)*vmestox3/Math.PI,2))));
                }
        }
