package com.amajon.testcases;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.amajon.pageobjects.AnniversaryGiftCardPage;
import com.amajon.pageobjects.GiftCardDetailPage;
import com.amajon.pageobjects.HomePage;
import com.amajon.pageobjects.ProductDetail;
import com.amajon.pageobjects.ProductResult;

public class AmazonTest1 extends BaseClass {

	@Test
	public void testCase1() throws IOException {
		driver.get(url);
		HomePage hp = new HomePage(driver);
		ProductDetail pd = new ProductDetail(driver);
		ProductResult pr = new ProductResult(driver);
		BaseClass bs = new BaseClass();
		hp.goToItem();
		pr.clickOnItem();
		pd.getOffer();
		bs.captureScreenShot(driver, browser);
		bs.goToHome();
	}

	

}
