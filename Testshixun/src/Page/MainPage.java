package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest;


public class MainPage extends BaseTest{
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	

	//�����ʾ����
	public WebElement get_create() {
		return driver.findElement(By.xpath("//div[@id='panel-1']/div[2]/div/span[2]"));
	}
	//��������
	public WebElement exit_name() {
		return driver.findElement(By.id("surveyTitle"));
	}
	//����
	public WebElement exit_describe() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[4]/div/div[3]/div[2]/div"));
	}
	//��ӭ
	public WebElement exit_welcome() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[5]/div/div[3]/div[2]/div"));
	}
	//������Ϣ
	public WebElement exit_endmessage() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[6]/div/div[3]/div[2]/div"));
	}
	//����url
	public WebElement exit_endurl() {
		return driver.findElement(By.id("endUrl"));	
	}
	//url����
	public WebElement exit_urldescribe() {
		return driver.findElement(By.id("endUrlDescription"));	
	}
	//����
	public WebElement save_form() {
		return  driver.findElement(By.id("save-form-button"));	
	}
	//���ڸ�ʽ
	public WebElement date() {
		return driver.findElement(By.id("dateFormat"));
	}
	//Ĭ������
	public WebElement createsample(){
		return driver.findElement(By.name("createsample"));
	}
	//�ṹ
	public WebElement StructureButton(){
		return driver.findElement(By.id("adminsidepanel__sidebar--selectorStructureButton"));
	}
	//�����
	public WebElement CreateQuestionGroup(){
		return driver.findElement(By.id("adminsidepanel__sidebar--selectorCreateQuestionGroup"));
	}
	//�����
	public WebElement groupTitle(){
		return driver.findElement(By.id("groupTitle"));
	}
	//���沢�������
	public WebElement save_new_question_button(){
		return  driver.findElement(By.id("save-and-new-question-button"));
	}
	//����
	public WebElement Question(){
		return  driver.findElement(By.xpath("//div[@id='advancedQuestionEditor']/div/span/div[2]/div/div/div/div/div[2]/div/div[3]/div[2]/div"));
	}
	//����
	public WebElement save_button(){
		return  driver.findElement(By.id("save-button"));
	}
	//����
	public WebElement SettingsButton(){
		return  driver.findElement(By.id("adminsidepanel__sidebar--selectorSettingsButton"));
	}
	//����
	public WebElement sidemenu_overview(){
		return  driver.findElement(By.id("sidemenu_overview"));
	}
	//���ñ�����
	public WebElement ls_activate_survey(){
		return  driver.findElement(By.id("ls-activate-survey"));
	}
	//���沢���ñ�����
	public WebElement activateSurvey__basicSettings(){
		return  driver.findElement(By.id("activateSurvey__basicSettings--proceed"));
	}
	//ֹͣ������
	public WebElement stop_survey(){
		return  driver.findElement(By.id("ls-stop-survey"));
	}
	//ͣ�õ���
	public WebElement stopsurvey(){
		return  driver.findElement(By.xpath("//input[@value='ͣ�õ���']"));
	}
	//�����б�
	public WebElement list(){
		return  driver.findElement(By.xpath("//div[@id='panel-2']/div[2]/div/span[2]"));
	}
	//���test1
	public WebElement clicktest1(){
		return  driver.findElement(By.linkText("test1"));
	}
	//���test2
		public WebElement clicktest2(){
			return  driver.findElement(By.linkText("test2"));
		}
	//�������
	public WebElement CreateQuestion(){
		return  driver.findElement(By.id("adminsidepanel__sidebar--selectorCreateQuestion"));
	}
	//���������ʽ
	public WebElement trigger_question(){
		return  driver.findElement(By.id("trigger_question_selector_button"));
	}
	//��ѡ��
	public WebElement danxuan(){
		return  driver.findElement(By.linkText("��ѡ��"));
	}
	//��ѡ������
	public WebElement danxuan_3(){
		return driver.findElement(By.xpath("//div[@id='collapsible_��ѡ��']/div/div/a[3]"));
	}
	//ѡ�������ύ
	public WebElement select(){
		return driver.findElement(By.id("selector__select-this-question_type_selector"));
	}
	//����
	public WebElement daan(){
		return driver.findElement(By.linkText("����"));
	}
	//�������
	public WebElement kuaisuadd(){
		return driver.findElement(By.xpath("//div[@id='advanced-options-container']/div[2]/div/div/div/div/button"));
	}
	//��ӿ�
	public WebElement addtext(){
		return driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[2]/div/div[2]/textarea"));
	}
	//���
	public WebElement addbutton(){
		return  driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[3]/div/div/button[2]"));
	}
    //�滻
	public WebElement replacebutton(){
		return  driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[3]/div/div/button[1]"));
	}
	//��������
	public WebElement zhenlie(){
		return  driver.findElement(By.linkText("����"));
	}
	//��������
	public WebElement zhenlie_4(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_����']/div/div/a[4]/em"));
	}
	//������
	public WebElement ziwenti(){
		return  driver.findElement(By.linkText("������"));
	}
	//��ѡ��
	public WebElement duoxuan(){
		return  driver.findElement(By.linkText("��ѡ��"));
	}
	//��ѡ����
	public WebElement duoxuan_3(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_��ѡ��']/div/div/a[3]/em"));
	}
	//�ı�����
	public WebElement text(){
		return  driver.findElement(By.linkText("�ı�����"));
	}
	//�ı�����
	public WebElement text_3(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_�ı�����']/div/div/a[3]/em"));
	}
	//��������
	public WebElement yanma(){
		return  driver.findElement(By.linkText("��������"));
	}
	//���������Ա�
	public WebElement yanma_5(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_��������']/div/div/a[5]/em"));
	}
	//��һ����
	public WebElement testgroupid1(){
		return  driver.findElement(By.xpath("//div[@id='questionexplorer']/div[2]/ul/li/div/a/span"));
	}	
	//��һ������
	public WebElement testid1(){
		return  driver.findElement(By.xpath("//div[@id='questionexplorer']/div[2]/ul/li/ul/li/a/span"));
	}
	//����
	public WebElement copy(){
		return  driver.findElement(By.id("copy_button"));
	}
	//����༭
	public WebElement questionEditorButton(){
		return  driver.findElement(By.id("questionEditorButton"));
	}
	//������	
	public WebElement questionCode(){
		return  driver.findElement(By.id("questionCode"));
	}
	//��������
	public WebElement export_button(){
		return  driver.findElement(By.id("export_button"));
	}
	//��������
	public WebElement impor_button(){
		return  driver.findElement(By.id("import-button"));
	}
	//ѡ���ļ�
	public WebElement the_file(){
		return  driver.findElement(By.id("the_file"));
	}
	//�༭Ĭ�ϴ�
	public WebElement default_value_button(){
		return  driver.findElement(By.id("default_value_button"));
	}
	//Ĭ�ϴ������
	public WebElement default_text(){
		return  driver.findElement(By.id("defaultanswerscale_0_zh-Hans_61"));
	}
	//����߼�
	public WebElement check_logic_button(){
		return  driver.findElement(By.id("check_logic_button"));
	}
	//�򿪿ɴ�ӡ����ͼ
	public WebElement printablesubmit(){
		return  driver.findElement(By.name("printablesubmit"));
	}
	//����
	public WebElement tools_button(){
		return  driver.findElement(By.id("tools_button"));
	}
	//���ߡ���ɾ������
	public WebElement tool_delete(){
		return  driver.findElement(By.linkText("ɾ������"));
	}
	//ɾ������
	public WebElement delete(){
		return  driver.findElement(By.xpath("//input[@value='ɾ������']"));
	}
	//���ߡ������ٷ���
	public WebElement fanyi(){
		return  driver.findElement(By.linkText("���ٷ���"));
	}
	//���ߡ�����������
	public WebElement retiaojian(){
		return  driver.findElement(By.linkText("��������"));
	}
	//���ߡ�������߼�
	public WebElement tool_check(){
		return  driver.findElement(By.linkText("����߼�"));
	}
	//���ߡ��������
	public WebElement tool_zhengqi(){
		return  driver.findElement(By.linkText("�����"));
	}
    //���ߡ�����������
	public WebElement tool_group(){
		return  driver.findElement(By.linkText("��������"));
	}
	//ɾ������
	public WebElement delete_button(){
		return  driver.findElement(By.id("delete_button"));
	}
	//ɾ������ȷ��
	public WebElement ok_button(){
		return  driver.findElement(By.id("identity__bsconfirmModal_button_ok"));
	}
	//�������
	public WebElement preview_question(){
		return  driver.findElement(By.id("preview_question"));
	}
	//�������
	public WebElement preview_questiongroup(){
		return  driver.findElement(By.id("preview_questiongroup"));
	}
	//�������
	public WebElement preview_survey(){
		return  driver.findElement(By.id("preview_survey"));
	}
	//������
	public WebElement export_group(){
		return  driver.findElement(By.id("export"));
	}
	//������
	public WebElement import_group(){
		return  driver.findElement(By.id("import"));
	}
	//��鵱ǰ���߼�
	public WebElement check_survey_logic(){
		return  driver.findElement(By.id("check_survey_logic"));
	}
	//������༭
	public WebElement group_editor(){
		return   driver.findElement(By.xpath("//div[@id='advancedQuestionGroupEditor']/div/span/div/button[2]"));
	}
	//����������
	public WebElement group_descripe(){
		return  driver.findElement(By.xpath("//div[@id='advancedQuestionGroupEditor']/div/span/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/div"));
	}
	//ɾ����ǰ��
	public WebElement delete_current_question_group(){
		return  driver.findElement(By.id("delete_current_question_group"));
	}
	//ɾ����ǰ�顪��ȷ��
	public WebElement ok_deletegroup(){
		return  driver.findElement(By.id("identity__bsconfirmModal_button_ok"));
	}
	//��ʾ/����
	public WebElement selector__exportTypeSelector(){
		return  driver.findElement(By.id("selector__exportTypeSelector--buttonText"));
	}
	//����ṹ (.lss)
	public WebElement lss(){
		return  driver.findElement(By.linkText("����ṹ (.lss)��"));
	}
	//queXML ��ʽ (*.xml)
	public WebElement xml(){
		return  driver.findElement(By.linkText("queXML ��ʽ (*.xml)"));
	}
	//����queXML PDF
	public WebElement pdf(){
		return  driver.findElement(By.linkText("����queXML PDF"));
	}
	//ʹ��Tab�ָ�����ʽ�ļ���*.txt��
	public WebElement txt(){
		return  driver.findElement(By.linkText("ʹ��Tab�ָ�����ʽ�ļ���*.txt��"));
	}
	//�ɴ�ӡ�ĵ��飨*.html��
	public WebElement html(){
		return  driver.findElement(By.linkText("�ɴ�ӡ�ĵ��飨*.html��"));
	}
	//����浵�ļ���.lsa��
	public WebElement lsa(){
		return  driver.findElement(By.linkText("����浵�ļ���.lsa��"));
	}
	//�ɴ�ӡ�ĵ���
	public WebElement show(){
		return  driver.findElement(By.linkText("�ɴ�ӡ�ĵ���"));
	}
	//������ť
	public WebElement TypeSelector(){
		return  driver.findElement(By.id("selector__select-this-exportTypeSelector"));
	}
	//�����ʾ��һ������
	public WebElement list_1(){
		return  driver.findElement(By.id("sid_0"));
	}
	//��ѡ�����
	public WebElement list_choose(){
		return  driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	}
	//��ѡ����顪��ɾ��
	public WebElement list_delete(){
		return  driver.findElement(By.linkText("ɾ��"));
	}
	//ɾ��������
	public WebElement list_yes(){
		return  driver.findElement(By.linkText("��"));
	}
	//��������
	public WebElement theme(){
		return  driver.findElement(By.linkText("��������"));
	}
	//ѡ������
	public WebElement theme_choose(){
		return  driver.findElement(By.id("theme"));
	}
	//fruity����
	public WebElement theme_fruity(){
		return  driver.findElement(By.xpath("//option[@value='fruity']"));
	}
	//�������⡪����
	public WebElement theme_yes(){
		return  driver.findElement(By.xpath("//div[@id='massive-actions-modal-survey-grid-updateTheme-2']/div/div/div[3]/a/span"));
	}
	//�����ʾ���list
	public WebElement surveygroup(){
		return  driver.findElement(By.xpath("//div[@id='surveyListActions']/ul/li[4]/a"));
	}
	//�����ʾ��顪��ѡ��
	public WebElement surveygroup_choose(){
		return  driver.findElement(By.id("surveygroupid"));
	}
	//�����ʾ��顪��another
	public WebElement surveygroup_another(){
		return  driver.findElement(By.xpath("(//option[@value='3'])[2]"));
	}
	//�����ʾ��顪����
	public WebElement surveygroup_yes(){
		return  driver.findElement(By.xpath("(//a[contains(text(),'��')])[3]"));
	}
	//���ù�������
	public WebElement lostdata(){
		return  driver.findElement(By.linkText("���ù�������"));
	}
	//��������
	public WebElement lostdata_add(){
		return  driver.findElement(By.id("expires"));
	}
	//�հ�
	public WebElement lostdata_kong(){
		return  driver.findElement(By.xpath("//div[@id='massive-actions-modal-survey-grid-expire-9']/div/div/div[3]"));
	}
	//�������ڡ�����
	public WebElement lostdata_yes(){
		return  driver.findElement(By.xpath("(//a[contains(text(),'��')])[7]"));
	}
	//������
	public WebElement search(){
		return  driver.findElement(By.id("Survey_searched_value"));
	}
	//������ť
	public WebElement search_button(){
		return  driver.findElement(By.name("yt0"));
	}
	//���ð�ť
	public WebElement rewrite(){
		return  driver.findElement(By.linkText("����"));
	}
	//�ʾ������
	public WebElement group(){
		return  driver.findElement(By.linkText("�ʾ������"));
	}
	//�����µ�����
	public WebElement group_creat(){
		return  driver.findElement(By.linkText("�����µ�����"));
	}
	//�ʾ�����顪������
	public WebElement group_name(){
		return  driver.findElement(By.id("SurveysGroups_name"));
	}
	//�ʾ�����顪������
	public WebElement group_title(){
		return  driver.findElement(By.id("SurveysGroups_title"));
	}
	//�ʾ�����顪������
	public WebElement group_text(){
		return  driver.findElement(By.id("SurveysGroups_description"));
	}
	
	
	public void Test1Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();;
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	
	public void Test4Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		date().click();
		new Select(date()).selectByVisibleText("yyyy.mm.dd");
		driver.findElement(By.xpath("//option[@value='3']")).click();
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	
	public void Test5Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		createsample().click();
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();	
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	public void Test6Page(String name,String grouptitle,String question) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(2000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(2000);
		ls_activate_survey().click();
		Thread.sleep(2000);
		activateSurvey__basicSettings().click();
	}
	public void Test7Page(String name,String grouptitle,String question,String grouptitle2) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle2);
		save_button().click();
		Thread.sleep(2000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(2000);
		ls_activate_survey().click();
		Thread.sleep(2000);
		activateSurvey__basicSettings().click();	
	}
	
	public void Test8Page(String name,String grouptitle,String question) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(2000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(2000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(3000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(3000);
		ls_activate_survey().click();
		Thread.sleep(3000);
		activateSurvey__basicSettings().click();
		Thread.sleep(3000);
		stop_survey().click();
		Thread.sleep(3000);
		stopsurvey().click();	
	}
	
	public void Test9Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		danxuan().click();
		danxuan_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(daan(), driver);
		daan().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(Keys.CONTROL, "a");
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		addbutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test10Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		zhenlie().click();
		zhenlie_4().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		daan().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test11Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		duoxuan().click();
		duoxuan_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(Keys.CONTROL, "a");
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		addbutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test12Page(String question,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		text().click();
		text_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(text);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test13Page(String question) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		yanma().click();
		yanma_5().click();
		select().click();
		Thread.sleep(2000);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test14Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		copy().click();
		Thread.sleep(2000);
		save_button().click();		
	}
	public void Test15Page(String id,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		questionEditorButton().click();
		Thread.sleep(2000);
		questionCode().clear();
		questionCode().sendKeys(id);
		Question().clear();
		Question().sendKeys(text);
		Thread.sleep(2000);
		save_button().click();		
	}
	public void Test17Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		export_button().click();
	}
	
	public void Test18Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		impor_button().click();
		Thread.sleep(2000);
		the_file().sendKeys("H:\\xishun-test\\limesurvey_question_60.lsq");
		save_button().click();	
	}
	public void Test19Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		impor_button().click();
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test20Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		default_value_button().click();
		Thread.sleep(2000);
		default_text().clear();
		default_text().sendKeys(text);
		save_button().click();
	}
	public void Test21Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		printablesubmit().click();	
	}
	public void Test22Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_delete().click();
		Thread.sleep(2000);
		delete().click();
	}
	public void Test23Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		fanyi().click();
	}
	public void Test24Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		retiaojian().click();
	}
	public void Test25Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_check().click();
	}
	public void Test26Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_zhengqi().click();
	}
	public void Test27Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_group().click();
	}
	public void Test28Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		delete_button().click();
		Thread.sleep(2000);
		ok_button().click();	
	}
	public void Test29Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_question().click();
	}
	public void Test30Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_questiongroup().click();
	}
	public void Test31Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_survey().click();	
	}
	public void Test32Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		export_group().click();
	}
	public void Test33Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		import_group().click();
		Thread.sleep(2000);
		the_file().sendKeys("H:\\xishun-test\\limesurvey_group_23.lsg");
		save_button().click();
	}
	public void Test34Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		check_survey_logic().click();
	}
	public void Test35Page(String title,String descripe) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		group_editor().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(title);
		group_descripe().click();
		group_descripe().sendKeys(descripe);
		save_button().click();
	}
	public void Test36Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		delete_current_question_group().click();
		Thread.sleep(2000);
		ok_deletegroup().click();
	}
	public void Test37Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		lss().click();
		TypeSelector().click();
	}
	public void Test38Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		xml().click();
		TypeSelector().click();
	}
	public void Test39Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		pdf().click();
		TypeSelector().click();
	}
	public void Test40Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		txt().click();
		TypeSelector().click();
	}
	public void Test41Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(3000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		html().click();
		Thread.sleep(2000);
		TypeSelector().click();
	}
	public void Test42Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest2().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		lsa().click();
		TypeSelector().click();
	}
	public void Test43Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		show().click();
		TypeSelector().click();
	}
	public void Test44Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		list_delete().click();
		Thread.sleep(2000);
		list_yes().click();
	}
	public void Test45Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		theme().click();
		Thread.sleep(2000);
		theme_choose().click();
		Thread.sleep(2000);
		theme_fruity().click();
		theme_yes().click();
	}
	public void Test46Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		surveygroup().click();
		Thread.sleep(2000);
		surveygroup_choose().click();
		Thread.sleep(2000);
		surveygroup_another().click();
		surveygroup_yes().click();
	}
	public void Test47Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		lostdata().click();
		Thread.sleep(2000);
		lostdata_add().clear();
		lostdata_add().sendKeys("31.11.2020 17:10");
		lostdata_kong().click();
		lostdata_yes().click();		
	}
	public void Test48Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		search().clear();
		search().sendKeys(text);
		Thread.sleep(2000);
		search_button().click();
	}
	public void Test49Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		search().clear();
		search().sendKeys(text);
		Thread.sleep(2000);
		search_button().click();
		Thread.sleep(2000);
		rewrite().click();
	}
	public void Test50Page(String name,String title,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		group().click();
		Thread.sleep(2000);
		group_creat().click();
		Thread.sleep(2000);
		group_name().clear();
		group_name().sendKeys(name);
		group_title().clear();
		group_title().sendKeys(title);
		group_text().clear();
		group_text().sendKeys(text);
		Thread.sleep(2000);
		save_form().click();
	}

	
	//ʵ�ֹ������϶�
	public static void scrollTo(WebElement element, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(false);", element);
    }
	
	
	

}
	