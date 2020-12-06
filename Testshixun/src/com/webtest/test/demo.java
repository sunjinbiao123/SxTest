package com.webtest.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.BaseTest;
import Page.MainPage;

public class demo extends BaseTest{
	MainPage MainPage;
	@BeforeClass
	public void init() {
		MainPage=new MainPage(driver);
	}
	//1.����һ���ǻ����������ĵ����ʾ�
	@Test(priority=1)
	public void test1() throws InterruptedException {
		MainPage.Test1Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "���ǰٶȽ���");
	} 
	//2.����һ���ǻ�����������޵������Ƶĵ����ʾ�
	@Test(priority=2)
	public void test2() throws InterruptedException {
		MainPage.Test1Page(null, "test1", "test1", "test1", "http://www.baidu.com /", "���ǰٶȽ���");
	}
	//3.�ÿո�����������ƴ���һ���ǻ����������ĵ����ʾ�
	@Test(priority=3)
	public void test3() throws InterruptedException {
		MainPage.Test1Page("  ", "test1", "test1", "test1", "http://www.baidu.com /", "���ǰٶȽ���");
	}
	//4.����һ���ǻ�������������ڷ�Ĭ�ϸ�ʽ�����ʾ�
	@Test(priority=4)
	public void test4() throws InterruptedException {	
		MainPage.Test4Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "���ǰٶȽ���");
	}
	//5.ʹ��ϵͳ��ʾ������������鴴���ǻ�����ʾ�
	@Test(priority=5)
	public void test5() throws InterruptedException {	
		MainPage.Test5Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "���ǰٶȽ���");
	}
	//6.����һ�������ʾ�����
	@Test(priority=6)
 	public void test6() throws InterruptedException {	
		MainPage.Test6Page("test2", "test1��", "test1����");
	}
	//7.����һ������������������ĵ����ʾ�����
	@Test(priority=7)
	public void test7() throws InterruptedException {	
		MainPage.Test7Page("test2", "test1��", "test1����","test2��");
	}
	//8.����һ�������ʾ�������ͣ�õ���
	@Test(priority=8)
	public void test8() throws InterruptedException {	
		MainPage.Test8Page("test1", "test1��", "test1����");
	}
	//9.����һ����ѡ����
	@Test(priority=9)
	public void test9() throws InterruptedException {	
		MainPage.Test9Page("ѡ��һ��ѡ��", "A","B");
	}
	//10.����һ����������
	@Test(priority=10)
	public void test10() throws InterruptedException {	
		MainPage.Test9Page("��������ѡ��", "A","B");
	}
	//11.����һ����ѡ����
	@Test(priority=11)
	public void test11() throws InterruptedException {	
		MainPage.Test11Page("��ѡ��ѡ��", "A","B");
	}
	//12.����һ���ı�����
	@Test(priority=13)
	public void test13() throws InterruptedException {	
		MainPage.Test12Page("���������ı�", "test");
	}
	//13.����һ����������
	@Test(priority=12)
	public void test12() throws InterruptedException {	
		MainPage.Test13Page("��ѡ���Ա�");
	}
	//14.����ĸ���
	@Test(priority=14)
	public void test14() throws InterruptedException {	
		MainPage.Test14Page();
	}
	//15.�����ż��������ȷ�༭
	@Test(priority=15)
	public void test15() throws InterruptedException {	
		MainPage.Test15Page("Q1","1");
	}
	//16.�����ŵĴ���༭
	@Test(priority=16)
	public void test16() throws InterruptedException {	
		MainPage.Test15Page("1","1");
	}
	//17.����ĵ���
	@Test(priority=17)
	public void test17() throws InterruptedException {	
		MainPage.Test17Page();
	}
	//18.����ĵ���
	@Test(priority=18)
	public void test18() throws InterruptedException {	
		MainPage.Test18Page();
	}
	//19.����Ŀհ׵���
	@Test(priority=19)
	public void test19() throws InterruptedException {	
		MainPage.Test19Page();
	}
	//20.�ı�����ı༭Ĭ�ϴ�
	@Test(priority=20)
	public void test20() throws InterruptedException {	
		MainPage.Test20Page("Ĭ�ϴ�");
	}
	//21.�Ӽ���߼��д򿪿ɴ�ӡ����ͼ
	@Test(priority=21)
	public void test21() throws InterruptedException {	
		MainPage.Test21Page();
	}
	//22.�Ӽ���߼������ù���ɾ������
	@Test(priority=22)
	public void test22() throws InterruptedException {	
		MainPage.Test22Page();
	}
	//23.�Ӽ���߼������ù��߿��ٷ���
	@Test(priority=23)
	public void test23() throws InterruptedException {	
		MainPage.Test23Page();
	}
	//24.�Ӽ���߼������ù�����������
	@Test(priority=24)
	public void test24() throws InterruptedException {	
		MainPage.Test24Page();
	}
	//25.�Ӽ���߼������ù��߼���߼�
	@Test(priority=25)
	public void test25() throws InterruptedException {	
		MainPage.Test25Page();
	}
	//26.�Ӽ���߼������ù�����������������������
	@Test(priority=26)
	public void test26() throws InterruptedException {	
		MainPage.Test26Page();
	}
	//27.�Ӽ���߼������ù��߰����������������������
	@Test(priority=27)
	public void test27() throws InterruptedException {	
		MainPage.Test27Page();
	}
	//28.ɾ��test1�����ʾ��һ������
	@Test(priority=28)
	public void test28() throws InterruptedException {	
		MainPage.Test28Page();
	}
	//29.Ԥ������
	@Test(priority=29)
	public void test29() throws InterruptedException {	
		MainPage.Test29Page();
	}
	//30.Ԥ������
	@Test(priority=30)
	public void test30() throws InterruptedException {	
		MainPage.Test30Page();
	}
	//31.Ԥ������
	@Test(priority=31)
	public void test31() throws InterruptedException {	
		MainPage.Test31Page();
	}
	//32.������ĵ���
	@Test(priority=32)
	public void test32() throws InterruptedException {	
		MainPage.Test32Page();
	}
	//33.������ĵ���
	@Test(priority=33)
	public void test33() throws InterruptedException {	
		MainPage.Test33Page();
	}
	//34.������ļ�鵱ǰ���߼�
	@Test(priority=34)
	public void test34() throws InterruptedException {	
		MainPage.Test34Page();
	}
	//35.��������⼰�����ı༭
	@Test(priority=35)
	public void test35() throws InterruptedException {	
		MainPage.Test35Page("Test2��","Test2");
	}
	//36.�������ɾ��
	@Test(priority=36)
	public void test36() throws InterruptedException {	
		MainPage.Test36Page();
	}
	//37.����ĵ���.lss��ʽ
	@Test(priority=37)
	public void test37() throws InterruptedException{	
		MainPage.Test37Page();
	}
	//38.����ĵ���.xml��ʽ
	@Test(priority=38)
	public void test38() throws InterruptedException {	
		MainPage.Test38Page();
	}
	//39.����ĵ���queXML PDF��ʽ
	@Test(priority=39)
	public void test39() throws InterruptedException {	
		MainPage.Test39Page();
	}
	//40.����ĵ���.txt��ʽ
	@Test(priority=40)
	public void test40() throws InterruptedException {	
		MainPage.Test40Page();
	}
	//41.����ĵ���.html��ʽ
	@Test(priority=41)
	public void test41() throws InterruptedException {	
		MainPage.Test41Page();
	}
	//42.�����ĵ���浵�ļ��ĵ���
	@Test(priority=42)
	public void test42() throws InterruptedException {	
		MainPage.Test42Page();
	}
	//43.�������ʾ
	@Test(priority=43)
	public void test43() throws InterruptedException {	
		MainPage.Test43Page();
	}
	//44.�����ɾ��
	@Test(priority=44)
	public void test44() throws InterruptedException {	
		MainPage.Test44Page();
	}
	//45.�������������
	@Test(priority=45)
	public void test45() throws InterruptedException {	
		MainPage.Test45Page();
	}
	//46.�༭������ʾ������
	@Test(priority=46)
	public void test46() throws InterruptedException {	
		MainPage.Test46Page();
	}
	//47.���õ���Ĺ�������
	@Test(priority=47)
	public void test47() throws InterruptedException {	
		MainPage.Test47Page();
	}
	//48.��ѯ������test�ĵ����ʾ�
	@Test(priority=48)
	public void test48() throws InterruptedException {	
		MainPage.Test48Page("test");
	}
	//49.������������
	@Test(priority=49)
	public void test49() throws InterruptedException {	
		MainPage.Test49Page("test");
	}
	//50.����һ�������ʾ���
	@Test(priority=50)
	public void test50() throws InterruptedException {	
		MainPage.Test50Page("another","another","another");
	}
	


}
