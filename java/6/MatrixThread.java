package day03;

public class MatrixThread implements Runnable {
	private int start;//���㿪ʼλ�ã��Դ����ֹ����̹߳�������
	private int [][]A;
	private int [][]B;
	private int [][]C;
	
	//�����̹߳��췽��
	public MatrixThread(int start,int [][]A,int [][]B,int [][]C){
		this.start=start;
		this.A=A;
		this.B=B;
		this.C=C;
	}
	
	@Override
	public void run() {
		int i,j,k;
		//�����߳���������ÿ�������߳�����
		for(i=start; i<test.M; i +=test.NUM_THREADS)      
		{      
			for(j=0;j<test.N;j++)      
			{           
				for( k=0; k< test.K;k++)         
					C[i][j]+=A[i][k]*B[k][j];         
			}
		}
	}
 
}
