package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import dataProvider.NSDataProvider;
import pages.LoginPage;
import pages.NaddUserGroupPage;

public class NaddUserGroup_Test extends BaseTest {
	NaddUserGroupPage naddUserGroupPage;
	LoginPage login;
	String url = "http://localhost:60/index.php/admin/authentication/sa/login";
	@BeforeClass
	public void initPage() throws InterruptedException {
		login = new LoginPage(driver);
		naddUserGroupPage = new NaddUserGroupPage(driver);
	}
	@Test(dataProvider="para8",dataProviderClass=NSDataProvider.class,priority=1)
	public void login(String username, String key, String password, String value) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(username.toString(), key.toString());
		map.put(password.toString(), value.toString());
		list.add(map);
		login.login(map.get("username"), map.get("password"));
		Thread.sleep(2000);
	}
	String url3 = "http://localhost:60/index.php/userGroup/index";
//�����û�������û���ģ��(7����������)
	@Test(dataProvider = "para4", dataProviderClass = NSDataProvider.class, priority = 2)
	public void createUserGroup(String usergroup, String userg, String description, String desc)
			throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url3);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(usergroup), String.valueOf(userg));
		map.put(String.valueOf(description), String.valueOf(desc));
		list.add(map);
		Thread.sleep(2000);
		naddUserGroupPage.cli_add().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
			naddUserGroupPage.add_group(map2.get("usergroup"), map2.get("description"));
			boolean flag = driver.findElement(By.xpath("//div[text()='�û�����ӳɹ���']")).isDisplayed();
			Assert.assertTrue(flag);
		}
	}

	// �����û�������û���ģ��(2����������)
	@Test(dataProvider = "para5", dataProviderClass = NSDataProvider.class, priority = 3)
	public void createUserGroup2(String usergroup, String userg, String description, String desc)
			throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url3);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(String.valueOf(usergroup), String.valueOf(userg));
		map.put(String.valueOf(description), String.valueOf(desc));
		list.add(map);
		Thread.sleep(2000);
		naddUserGroupPage.cli_add().click();
		Thread.sleep(3000);
		for (Map<String, String> map2 : list) {
			if (map2.get("usergroup").contains("a")) {
				naddUserGroupPage.addGroupName(map2.get("usergroup"));
				boolean flag = driver.findElement(By.xpath("//div[text()='�û�����ӳɹ���']")).isDisplayed();
				Assert.assertTrue(flag);
			} else {
				naddUserGroupPage.addGroupDesc(map2.get("description"));
				boolean flag = driver.findElement(By.xpath("//div[text()='�û�����ӳɹ���']")).isDisplayed();
				Assert.assertTrue(flag);
			}
		}
	}

}
