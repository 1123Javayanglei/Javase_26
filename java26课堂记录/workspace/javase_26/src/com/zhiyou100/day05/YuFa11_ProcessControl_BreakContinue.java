package com.zhiyou100.day05;

public class YuFa11_ProcessControl_BreakContinue {

	public static void main(String[] args) throws Exception{
		//��ת�ṹ֮break:ʹ����swicth��ѭ��
		//break����switch�У���ʾ����switch�ṹ
		int n=11;
		switch(n%5) {
		     case 0:
		    	 System.out.println("case 0");
		    	 break;
		     case 1:
		    	 System.out.println("case 1");
		    	 break;
		     case 2:
		    	 System.out.println("case 2");
		    	 break;
		     case 3:
		    	 System.out.println("case 3");
		    	 break;
		      default:
		    	 System.out.println("default 4");
		    	 break; 
		}
		//break����ѭ���У���������ѭ��
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				//System.out.println("i="+i+",j="+j);
//				if(j==3) {
//					break;//�����ڲ�forѭ��
//				}
			}
			if(i==3) {
				break;//�������forѭ��
			}
		}
		
		//��ת�ṹ֮ continue:ʹ����ѭ����
		for (int i = 0; i <=5; i++) {
			if(i==3) {
				continue;//��������ѭ��  ������һ��ѭ��
			}
			System.out.println("continue  i="+i);
		}
	}
}
