package one;
import java.text.DecimalFormat;
public class ReconociminentoImg {


        private int[][] imagen;
        public ReconociminentoImg (int[][] imagen)
        {
            this.imagen=imagen;
        }

        private double[][] matrizRedusida()
        {
            double[][] res={{0,0,0},{0,0,0},{0,0,0}};
            int m=imagen[0].length;
            int n=imagen.length;
            int sum=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<m-2;k++){
                        for(int l=0;l<n-2;l++){
                            sum=sum+imagen[l+j][k+i];
                        }
                    }
                    res[j][i]=(sum*1.0)/(Math.pow((m-2),2));
                    sum=0;
                }
            }

            return res;
        }

        public void mostrarMatrizRed()
        {
            double[][] res=matrizRedusida();
            DecimalFormat formato=new DecimalFormat("#.00");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(formato.format(res[j][i]) + "  ");
                }
                System.out.println("");
            }
        }

        public void matrizObjetivo(double[][] matObj)
        {
            double res=0.0;
            double promMatRed=0.0;
            double promMatObj=0.0;
            DecimalFormat formato=new DecimalFormat("#.00");
            double sum=0.0;
            double[][] matrizRed=matrizRedusida();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    sum=sum+matrizRed[j][i];
                }
            }

            promMatRed=sum/9;
            sum=0;

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    sum=sum+matObj[j][i];
                }
            }

            promMatObj=sum/9;

            res=promMatRed/promMatObj;

            System.out.print(formato.format(res) + "  ");
        }

}
