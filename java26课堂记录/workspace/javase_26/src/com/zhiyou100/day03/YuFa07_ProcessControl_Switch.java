package com.zhiyou100.day03;

public class YuFa07_ProcessControl_Switch {

	public static void main(String[] args) {
		//ͨ��switch �����·��жϼ���
		//���������¼�·�
		int month=3;
		switch(month) {
		      case 1:
		    	   System.out.println("month="+month+",�Ƕ���2!");
		    	   break;
		      case 2:
		    	   System.out.println("month="+month+",�Ƕ���3!");
		    	   break;
		      case 3:
		    	   System.out.println("month="+month+",�Ǵ���1!");
		    	   break;
		      case 4:
		    	   System.out.println("month="+month+",�Ǵ���2!");
		    	   break;
		      case 5:
		    	   System.out.println("month="+month+",�Ǵ���3!");
		    	   break;
		      case 6:
		    	   System.out.println("month="+month+",���ļ�1!");
		    	   break;
		      case 7:
		    	   System.out.println("month="+month+",���ļ�2!");
		    	   break;
		      case 8:
		    	   System.out.println("month="+month+",���ļ�3!");
		    	   break;
		      case 9:
		    	   System.out.println("month="+month+",���＾1!");
		    	   break;
		      case 10:
		    	   System.out.println("month="+month+",���＾2!");
		    	   break;
		      case 11:
		    	   System.out.println("month="+month+",���＾3!");
		    	   break;
		      case 12:
		    	   System.out.println("month="+month+",�Ƕ���1!");
		    	   break;
		      default:
		    	   System.out.println("month="+month+",�·ݲ��Ϸ�!");
		    	   break;
		}
		//��д��
		//Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		switch(month) {//switch������ʽ��ֵ ������int String enum
	      case 12:
	      case 1:
	      case 2:
	    	   System.out.println("month="+month+",�Ƕ���3!");
	    	   break;
	      case 3:
	      case 4:
	      case 5:
	    	   System.out.println("month="+month+",�Ǵ���3!");
	    	   break;
	      case 6:
	      case 7:
	      case 8:
	    	   System.out.println("month="+month+",���ļ�3!");
	    	   break;
	      case 9:
	      case 10:
	      case 11:
	    	   System.out.println("month="+month+",���＾3!");
	    	   break;
	      default:
	    	   System.out.println("month="+month+",�·ݲ��Ϸ�!");
	    	   break;
	    }
		
		//switch�ڿ���ʱ����ʹ�ã�1 switch��ʽ����  2 switchֻ����������ٷ� ���ܱ�ʾ��Χ
	}
}
