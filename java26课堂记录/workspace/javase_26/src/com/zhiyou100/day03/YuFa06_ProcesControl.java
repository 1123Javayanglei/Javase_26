package com.zhiyou100.day03;

public class YuFa06_ProcesControl {

	public static void main(String[] args) {
		//1˳��ṹ:������ ���ϵ���
		System.out.println(11);System.out.println(12);
		System.out.println(13);System.out.println(14);
		//2.1ѡ��ṹ������֧
		//�����Ů�� ���
		//���������¼�Ա�
		char sex='Ů';
		//�ж��Ƿ�ΪŮ  �����Ů �ʹ�ӡ���
		if(sex=='Ů') {
			System.out.println("sex="+sex+",��Ů���!");
		}
		
		//2.2 ѡ��ṹ��˫��֧
		//�����Ů�� ��ӡ����Ұ�  �������Ů�� ��ӡȥ�����
		if(sex=='Ů'){
			System.out.println("sex="+sex+",��Ů�����Ұ�!");
		}else{
			System.out.println("sex="+sex+",�㲻��Ů��  ��ȥ�����!");
		}
		
		//2.3 ѡ��ṹ�����֧
		//���ݷ��� �жϴ�ӡ��������� 60 ���� 70 ���� 80 ����
		//���������¼����
		float score=65.5f;
		if(score<0||score>100) {
			System.out.println("score="+score+",������Ч!");
		}else if(score<60) {//������������score>=0&&score<=100
			System.out.println("score="+score+",�����񣡣���");
		}else if(score<70) {//������������score>=60&&score<=100
			System.out.println("score="+score+",���񣡣���");
		}else if(score<80) {//������������score>=0&&score<=100
			System.out.println("score="+score+",���ã�����");
		}else {//������� ��������
			System.out.println("score="+score+",���㣡����");
		}
	}

}
