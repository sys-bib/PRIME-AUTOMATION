package stepDef;

import factory.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regressionstep {
    protected WebDriver webDriver;

    @Before
    public void startDriver() {
        webDriver = new DriverManager().initializeDriver();
    }

    @Given("access prime {string}")
    public void access_prime(String url) {
        webDriver.get(url);
    }

    @Given("click login button")
    public void clickLoginButton() throws InterruptedException {
        webDriver.findElement(By.xpath("//button['Login']")).click();
        Thread.sleep(10000);
    }

    @And("i fill in the column email with {string}")
    public void iFillInTheColumnEmailWith(String fieldValue) {
        webDriver.findElement(By.id("email")).sendKeys(fieldValue);
    }

    @And("click button next")
    public void clickButtonNext() throws InterruptedException {
        webDriver.findElement(By.id("btnNextPassword")).click();
        Thread.sleep(1000);
    }

    @And("i fill in the column password with {string}")
    public void iFillInTheColumnPassword(String fieldValue) {
        webDriver.findElement(By.xpath("//input[contains(@placeholder, \"Password\")]")).sendKeys(fieldValue);
    }

    @Then("click sign in button idaman")
    public void clickSignInButtonIdaman() {
        webDriver.findElement(By.xpath("//span[contains(@class, \"submit\")]")).click();
    }

    @And("click button confirm")
    public void clickbuttonconfirm() {
        webDriver.findElement(By.id("idSIButton9")).click();
    }

    @And("choose yes")
    public void chooseyes() throws InterruptedException {
        webDriver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(1000);
    }

    @Then("click login button idaman")
    public void clickLoginButtonIdaman() {
        webDriver.findElement(By.id("btnLogin")).click();
    }

    @And("choose list my request on file transfer")
    public void chooselistmyrequestonfiletransfer() throws InterruptedException {
        webDriver.findElement(By.linkText("See list request now")).click();
        Thread.sleep(15000);
    }

    @And("click button new file transfer")
    public void clickbuttonnewfiletransfer() {
        webDriver.findElement(By.xpath("//button[text()=' + New file transfer']")).click();
    }

    @And("fill noskorganisasi with {string}")
    public void fillnoskorganisasiwith(String fieldvalue) {
        webDriver.findElement(By.id("NoSkOrganisasi")).sendKeys(fieldvalue);
    }

    @And("fill nomorhp with {string}")
    public void fillnomorhpwith(String fieldvalue) {
        webDriver.findElement(By.id("ContactPersonMobileNumber")).sendKeys(fieldvalue);
    }

    @And("fill alamat with {string}")
    public void fillalamatwith(String fieldvalue) {
        webDriver.findElement(By.id("Alamat")).sendKeys(fieldvalue);
    }

    @Then("click nextsender button")
    public void clicknextsenderbutton() {
        webDriver.findElement(By.xpath("//button[text()='Next']")).click();
    }

    @Then("click addfile button")
    public void clickaddfilebutton() {
        webDriver.findElement(By.xpath("//button[text()=' Add File']")).click();
    }

    @And("choose kode klasifikasi berkas {string}")
    public void choosekodeklasifikasiberkas(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-KodeSubPemberkasan-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose keterangan akses dan keamanan {string}")
    public void chooseketeranganaksesdankeamanan(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-KeteranganAksesKeamanan-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("fill nama berkas with {string}")
    public void fillnamaberkaswith(String fieldvalue) {
        webDriver.findElement(By.id("NamaBerkas")).sendKeys(fieldvalue);
    }

    @And("fill lokasi simpan with {string}")
    public void filllokasisimpanwith(String fieldvalue) {
        webDriver.findElement(By.id("LokasiTersimpan")).sendKeys(fieldvalue);
    }

    @And("fill uraian informasi with {string}")
    public void filluraianinformasiwith(String fieldvalue) {
        webDriver.findElement(By.id("UraianInformasi")).sendKeys(fieldvalue);
    }

    @And("choose kategori arsip {string}")
    public void choosekategoriarsip(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-KategoriArsip-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose waktu berkas mulai {string}")
    public void choosewaktuberkasmulai(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("KurunWaktuBerkasMulai")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.id("KurunWaktuBerkasMulai")).sendKeys(Keys.ENTER);
    }

    @And("choose waktu berkas akhir {string}")
    public void choosewaktuberkasakhir(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("KurunWaktuBerkasAkhir")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.id("KurunWaktuBerkasAkhir")).sendKeys(Keys.ENTER);

    }

    @And("choose tingkat perkembangan berkas {string}")
    public void choosetingkatperkembanganberkas(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-TingkatPerkembanganDokumen-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"headerModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("fill jenis berkas with {string}")
    public void filljenisberkaswith(String fieldvalue) {
        webDriver.findElement(By.id("JenisBerkas")).sendKeys(fieldvalue);
    }

    @And("fill jumlah item with {string}")
    public void filljumlahitemwith(String fieldvalue) {
        webDriver.findElement(By.id("JumlahBerkas")).sendKeys(fieldvalue);
    }

    @Then("click button add on file")
    public void clickbuttonaddonfile() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(2000);
    }

    @Then("click button ok")
    public void clickbuttonok() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='OK']")).click();
        Thread.sleep(1000);
    }

    @Then("click button add item")
    public void clickbuttonadditem() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()=' Add Item']")).click();
        Thread.sleep(1000);
    }

    @And("fill perihal with {string}")
    public void fillperihalwith(String fieldvalue) {
        webDriver.findElement(By.id("UraianInformasiItem")).sendKeys(fieldvalue);
    }

    @And("fill nomor dokumen with {string}")
    public void fillnomordokumenwith(String fieldvalue) {
        webDriver.findElement(By.id("NoItemArsip")).sendKeys(fieldvalue);
    }

    @And("fill keterangan with {string}")
    public void fillketeranganwith(String fieldvalue) {
        webDriver.findElement(By.id("KeteranganItem")).sendKeys(fieldvalue);
    }

    @And("fill jumlah dokumen with {string}")
    public void filljumlahdokumenwith(String fieldvalue) {
        webDriver.findElement(By.id("Jumlah")).sendKeys(fieldvalue);
    }

    @And("upload file digital in directory {string}")
    public void uploadfiledigitalindirectory(String fieldValue) {
        WebElement chooseFile = webDriver.findElement(By.id("FileNameUser"));
        chooseFile.sendKeys(fieldValue);
    }

    @And("choose bentuk arsip {string}")
    public void choosebentukarsip(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-BentukItem-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"itemModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"itemModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose tingkat perkembangan berkas item {string}")
    public void choosetingkatperkembanganberkasitem(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-TingkatPerkembanganBerkas-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"itemModal\"]/span/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"itemModal\"]/span/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose tanngal dokumen with {string}")
    public void chooseTanngalDokumenWith(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("TanggalArsip")).sendKeys(fieldValue);
        webDriver.findElement(By.id("TanggalArsip")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("click button add on item")
    public void clickbuttonaddonitem() throws InterruptedException {
        webDriver.findElement(By.id("Add")).click();
        Thread.sleep(5000);
    }

    @Then("click button submit")
    public void clickbuttonsubmit() {
        webDriver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @And("choose yes submit")
    public void chooseyessubmit() {
        webDriver.findElement(By.xpath("//button[text()='Yes, submit it!']")).click();
    }

    @And("choose yes submit survey")
    public void chooseyessubmitsurvey() {
        webDriver.findElement(By.xpath("//button[text()='Yes, submit it!']")).click();
    }

    @Then("click button add item 2")
    public void clickbuttonadditem2() throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"child-2\"]/div/div[1]/button")).click();
        Thread.sleep(1000);
    }

    @Then("click bell icon")
    public void clickbellicon() throws InterruptedException {
        webDriver.findElement(By.xpath("//i[contains(@class, \"fa-solid fa-bell fa-xl\")]")).click();
        Thread.sleep(2000);
    }

    @And("choose notif request")
    public void choosenotifrequest() throws InterruptedException {
        webDriver.findElement(By.xpath("//medium[text()='TR-000000001-2024-I50010']")).click();
        Thread.sleep(2000);
    }
    @And("choose notif approved")
    public void choosenotifapproved() throws InterruptedException {
        webDriver.findElement(By.xpath("//medium[text()='TR-000000001-2024-I50010']")).click();
        Thread.sleep(2000);
    }
    @And("choose notif assigned")
    public void choosenotifassigned() throws InterruptedException {
        webDriver.findElement(By.xpath("//medium[text()='TR-000000001-2024-I50010']")).click();
        Thread.sleep(2000);
    }
    @And("choose notif surveyed")
    public void choosenotifsurveyed() throws InterruptedException {
        webDriver.findElement(By.xpath("//medium[text()='TR-000000001-2024-I50010']")).click();
        Thread.sleep(2000);
    }
    @And("choose notif baonprogress")
    public void choosenotifbaonprogress() throws InterruptedException {
        webDriver.findElement(By.xpath("//medium[text()='BA-000000001-2024-I50010']")).click();
        Thread.sleep(2000);
    }

    @And("click view all messages")
    public void clickviewallmessages() throws InterruptedException {
        webDriver.findElement(By.linkText("View all messages")).click();
        Thread.sleep(2000);
    }

    @Then("click button approve")
    public void clickbuttonapprove() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='Approve']")).click();
        Thread.sleep(1000);
    }

    @And("choose yes approve")
    public void chooseyesapprove() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='Yes, approved it!']")).click();
        Thread.sleep(10000);
    }

    @Then("click button assign to")
    public void clickbuttonassignto() throws InterruptedException {
        webDriver.findElement(By.id("btnAssign")).click();
        Thread.sleep(1000);
    }

    @And("choose rcpic")
    public void choosercpic() throws InterruptedException {
        webDriver.findElement(By.id("select2-AssignTo-container")).click();
        Thread.sleep(15000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-AssignTo-results\"]/li[1]")).click();
        Thread.sleep(2000);
    }

    @And("click button assign")
    public void clickbuttonassign() {
        webDriver.findElement(By.xpath("//button[text()='Assign']")).click();
    }

    @Then("click tab survey")
    public void clicktabsurvey() throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"fileTransferSurveyForm\"]/div[2]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
    }

    @And("fill media arsip {string}")
    public void fillmediaarsip(String fieldvalue) {
        webDriver.findElement(By.id("MediaArsip")).sendKeys(fieldvalue);
    }

    @And("fill jumlah {string}")
    public void filljumlah(String fieldvalue) {
        webDriver.findElement(By.id("Jumlah")).sendKeys(fieldvalue);
    }

    @And("fill sistem penataan {string}")
    public void fillsistempenataan(String fieldvalue) {
        webDriver.findElement(By.id("SistemPenataan")).sendKeys(fieldvalue);
    }

    @And("fill catatan {string}")
    public void fillcatatan(String fieldvalue) {
        webDriver.findElement(By.id("Catatan")).sendKeys(fieldvalue);
    }

    @And("choose kurun waktu {string}")
    public void choosekurunwaktu(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("Survey_KurunWaktu")).sendKeys(fieldValue);
        webDriver.findElement(By.id("Survey_KurunWaktu")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @And("choose tanggal survey {string}")
    public void choosetanggalsurvey(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("TanggalSurvey")).sendKeys(fieldValue);
        webDriver.findElement(By.id("TanggalSurvey")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose kondisi arsip {string}")
    public void choosekondisiarsip(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("select2-KondisiArsip-container")).click();
        webDriver.findElement(By.xpath("//*[@id=\"kondisiArsip\"]/span[2]/span/span[1]/input")).sendKeys(fieldValue);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"kondisiArsip\"]/span[2]/span/span[1]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("choose bentuk arsip dan isi")
    public void choosebentukarsipdanisi() throws InterruptedException {
        webDriver.findElement(By.id("select2-BerkasArsip-container")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-BerkasArsip-results\"]/li[1]")).click();
        Thread.sleep(1000);
    }

    @And("choose sarana simpan")
    public void choosesaranasimpan() throws InterruptedException {
        webDriver.findElement(By.id("select2-SaranaSimpan-container")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-SaranaSimpan-results\"]/li[1]")).click();
        Thread.sleep(1000);
    }

    @And("choose retensi arsip")
    public void chooseretensiarsip() throws InterruptedException {
        webDriver.findElement(By.id("select2-RetensiArsip-container")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-RetensiArsip-results\"]/li[1]")).click();
        Thread.sleep(1000);
    }

    @And("choose rekomendasi")
    public void chooserekomendasi() throws InterruptedException {
        webDriver.findElement(By.id("select2-RekomendasiArsip-container")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-RekomendasiArsip-results\"]/li[1]")).click();
        Thread.sleep(1000);
    }

    @And("choose rc penyimpanan sementara")
    public void choosercpenyimpanansementara() throws InterruptedException {
        webDriver.findElement(By.id("select2-RcPenyimpanan-container")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"select2-RcPenyimpanan-results\"]/li[1]")).click();
        Thread.sleep(1000);
    }

    @And("logout account")
    public void logoutaccount() throws InterruptedException {
        webDriver.findElement(By.xpath("//img[contains(@class, \"img-avatar\")]")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//i[contains(@class, \"fa fa-lock\")]")).click();
        Thread.sleep(5000);
    }
    @And("click sign this document button")
    public void clicksignthisdocumentbutton() throws InterruptedException {
        webDriver.findElement(By.id("btnSign")).click();
        Thread.sleep(1000);
    }
    @And("choose sign")
    public void choosesign() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='Sign']")).click();
        Thread.sleep(10000);
    }
    @And("complete sign")
    public void completesign() throws InterruptedException {
        webDriver.findElement(By.xpath("//button[text()='Complete']")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//button[text()='Yes, complete it!']")).click();
        Thread.sleep(10000);
    }
}
