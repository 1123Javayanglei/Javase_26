package com.zhiyou100.day05;

public class LianXi1 {

	public static void main(String[] args) {




		
//		   1 ����һ��װ10��intԪ�ص����飺��Ԫ�صĺ�		
		//����������� ������ֽ�arr ����Ԫ�ظ�ֵ
		int[] arr=new int[] {1,5,9,-10,9,7,6,4,3,-10};
		//���������¼��
		int sum=0;
		//��������   :д��for  alt+/ ѡ��ڶ�������
		for (int i = 0; i < arr.length; i++) {
			  sum+=arr[i];
		}
		System.out.println("һ��װ10��intԪ�ص����飺��Ԫ�صĺ�="+sum);
		
		
//      2����һ��װ10��intԪ�ص����飺��ƽ����
		double pjz=sum*1.0/arr.length;
		System.out.println("����һ��װ10��intԪ�ص����飺��ƽ����="+pjz);
		
//      3����һ��װ10��intԪ�ص����飺��ȡ���ֵ
		//�������max��¼���ֵ  ����ʼֵΪarr[0]
		int max=arr[0];
		//��max�������е�Ԫ��һһ�Ƚ� 
		for (int i = 1; i < arr.length; i++) {
			//��max�͵�ǰԪ��arr[i]���Ƚϣ�  �����ǰԪ�ش���max ����max��¼��ǰԪ�ص�ֵ
			max=(max<arr[i]?arr[i]:max);
		}
		System.out.println("����һ��װ10��intԪ�ص����飺��ȡ���ֵ="+max);
		
//      4����һ��װ10��intԪ�ص����飺 ��ȡ���ֵԪ�ص��±�	
		//�Ȼ�ȡ���ֵ�������Ѿ���ȡ��max
		//�ٱ�������  �õ�ǰԪ�غ�max���Ƚ�  �������max �ʹ�ӡ��ǰԪ�ص��±�
		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i]) {
				System.out.println("���ֵ��:"+max+"  Ԫ���±���:"+i);
			}
		}
		
//      5 ��һ��10��intԪ�ص����� ���Ϊ2������  һ��װ���� һ��װż��
		

	}

}
