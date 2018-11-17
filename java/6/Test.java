package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class test {
	public final static int M=1024;//定义常量：矩阵A的行数
	public final static int K=1024;//定义常量：矩阵A的列数，矩阵B的行数
	public final static int N=1024;//定义常量：矩阵B的列数
	final static int NUM_THREADS=16;//定义常量：线程数量
	private static int [][]A;//矩阵A
	private static int [][]B;//矩阵B
	private static int [][]C;//矩阵C
	//---------------------
	//驱动类构造方法
	public test(){
		A=new int[M][K];
		B=new int[K][N];
		C=new int[M][N];//A、B、C初始化
		fillRandom(A);//用0-99的随机数初始化矩阵A
		fillRandom(B);//用0-99的随机数初始化矩阵B
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
				C[i][j]=0;//将C矩阵全置零		
	}
	
	//-------------------
	//初始化方法：产生0-99的随机数初始化矩阵A、B
	private void fillRandom(int[][] A) {
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++)
				A[i][j]=(int)(Math.random()*100);
		}
	}
	
	//--------------------
	//串行矩阵乘法运算
	public static void singleThread(){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				for(int k=0;k<K;k++)
					C[i][j]+=A[i][k]*B[k][j];
			}
		}
	}
	
	//----------------------
	//main函数
	public static void main(String[] args){
		new test();//新建一个驱动类对象
		
		//随机产生三组C矩阵位置信息
		int []rol=new int[3];
		int []col=new int[3];
		for(int i=0;i<rol.length;i++){
			rol[i]=(int)(Math.random()*M);
			col[i]=(int)(Math.random()*N);
		}
		
		//--------------------------------
		//并行方法：建立工作线程，每个线程完成矩阵乘法运算的1/NUM_THREADS工作
        Thread[] workers=new Thread[NUM_THREADS];
		for(int i=0;i<NUM_THREADS;i++)
			workers[i]=new Thread(new MatrixThread(i,A,B,C));//建立工作线程
		long time1= System.currentTimeMillis();//记录开始时间
		for(int i=0;i<NUM_THREADS;i++){
			workers[i].start();//启动工作线程
		}
		for(int i=0;i<NUM_THREADS;i++){
			try{
				workers[i].join();//等待当前线程执行结束
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		long time2=System.currentTimeMillis();//记录结束时间
		//打印方法一使用的时间和矩阵C三个随机位置的值
		System.out.println("计算["+M+","+K+"]与["+K+","+N+"]阶矩阵乘法,并行("+NUM_THREADS+"线程)用时:"+(time2-time1)+"毫秒");
}
}