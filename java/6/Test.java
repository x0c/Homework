package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class test {
	public final static int M=1024;//���峣��������A������
	public final static int K=1024;//���峣��������A������������B������
	public final static int N=1024;//���峣��������B������
	final static int NUM_THREADS=16;//���峣�����߳�����
	private static int [][]A;//����A
	private static int [][]B;//����B
	private static int [][]C;//����C
	//---------------------
	//�����๹�췽��
	public test(){
		A=new int[M][K];
		B=new int[K][N];
		C=new int[M][N];//A��B��C��ʼ��
		fillRandom(A);//��0-99���������ʼ������A
		fillRandom(B);//��0-99���������ʼ������B
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
				C[i][j]=0;//��C����ȫ����		
	}
	
	//-------------------
	//��ʼ������������0-99���������ʼ������A��B
	private void fillRandom(int[][] A) {
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++)
				A[i][j]=(int)(Math.random()*100);
		}
	}
	
	//--------------------
	//���о���˷�����
	public static void singleThread(){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				for(int k=0;k<K;k++)
					C[i][j]+=A[i][k]*B[k][j];
			}
		}
	}
	
	//----------------------
	//main����
	public static void main(String[] args){
		new test();//�½�һ�����������
		
		//�����������C����λ����Ϣ
		int []rol=new int[3];
		int []col=new int[3];
		for(int i=0;i<rol.length;i++){
			rol[i]=(int)(Math.random()*M);
			col[i]=(int)(Math.random()*N);
		}
		
		//--------------------------------
		//���з��������������̣߳�ÿ���߳���ɾ���˷������1/NUM_THREADS����
        Thread[] workers=new Thread[NUM_THREADS];
		for(int i=0;i<NUM_THREADS;i++)
			workers[i]=new Thread(new MatrixThread(i,A,B,C));//���������߳�
		long time1= System.currentTimeMillis();//��¼��ʼʱ��
		for(int i=0;i<NUM_THREADS;i++){
			workers[i].start();//���������߳�
		}
		for(int i=0;i<NUM_THREADS;i++){
			try{
				workers[i].join();//�ȴ���ǰ�߳�ִ�н���
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		long time2=System.currentTimeMillis();//��¼����ʱ��
		//��ӡ����һʹ�õ�ʱ��;���C�������λ�õ�ֵ
		System.out.println("����["+M+","+K+"]��["+K+","+N+"]�׾���˷�,����("+NUM_THREADS+"�߳�)��ʱ:"+(time2-time1)+"����");
}
}