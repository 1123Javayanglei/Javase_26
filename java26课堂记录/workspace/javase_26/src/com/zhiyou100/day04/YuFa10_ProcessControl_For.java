package com.zhiyou100.day04;

public class YuFa10_ProcessControl_For {

	public static void main(String[] args) throws Exception{
		 int a=1;
//	     for(System.out.println("��ʼ����� a="+a);  a<4   ;System.out.println("�������  a="+a)) {
//	    	 System.out.println("ѭ���壺������a="+a);
//	    	 a++;
//	     }
	     //1 ��ִ�г�ʼ�����
	     //2 �ж��������ʽ�Ƿ����
	     //3 ���������ִ��ѭ����
	     //4 ִ�е������
	     //����ִ�� ���� 2 3 4 ֱ��2������
		 
//		 for(;;) {//�������ʽ��д Ĭ����true
//			 System.out.println("ѭ����");
//		 }
		 
		 //ͨ��whileѭ����1��10�ĺ�
		 int n1=1;int sum1=0;
		 while(n1<=10) {
			 sum1+=n1;
			 n1++;
		 }
		 System.out.println("n1="+n1+",sum1="+sum1);
		 
		 //1 ͨ��forѭ����1��10�ĺ�
		 int sum2=0;//ѭ����� ����Ҫ��ȡsum2��ֵ  ���԰Ѷ���sum2д��forѭ������
		 for(int n2=1;n2<=10;n2++) {//ѭ������ٹ��ı���n2 �Ѷ������n2 д��for�ĳ�ʼ������� 
			 sum2+=n2;
		 }
		 System.out.println("sum2="+sum2);
		 
		 //2 ��1��100������ż�����ҿ��Ա�3���������ݵĺ�
		 int sum3=0;
		 for(int n3=1;n3<=100;n3++) {
			 if(n3%2==0&&n3%3==0) {
				 sum3+=n3;
			 }
		 }
		 System.out.println("1��100������ż�����ҿ��Ա�3���������ݵĺ�="+sum3);
	     
	     //3 ��Ǯ��ټ���һ����Ǯ��һ��ֻ�����������֣�����ÿֻ3��Ǯ ĸ��ÿֻ2��Ǯ  3ֻС��1��Ǯ
		 //�����п��ܵ������ӡ����
		 //���������¼����ĸ��С����ֻ��
		 int gj,mj,xj;
		 //�����п��ܶ���һ��  �ж��Ƿ���ϰ�Ǯ�ټ�
		 for(gj=0;gj<=33;gj++) {//������ȡֵ��Χ[0,33]
			 for(mj=0;mj<=50;mj++) {//ĸ����ȡֵ��Χ[0,50]
                  for(xj=0;xj<=100;xj++) {//С����Χ[0,100]
                	    if(gj+mj+xj==100&&gj*3+mj*2+xj/3==100&&xj%3==0) {
                	    	 System.out.println("������ĸ����С��="+gj+":"+mj+":"+xj);
                	    }
                  }				 
			 }
		 }
		 
	}
}
