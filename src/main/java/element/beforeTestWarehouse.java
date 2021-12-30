package element;

public class beforeTestWarehouse {
    //用户中心网址
    private static String userCenterUrl = "https://mall.beyond-itcenter.com/uums/login/";
    //账号
    private static String username = "//*[@id=\"app\"]/div/form/div[1]/div/div/input";
    //密码
    private static String password = "//*[@id=\"app\"]/div/form/div[2]/div/div/input";
    //登录按钮
    private static String UCLoginButton = "//*[@id=\"app\"]/div/form/div[3]/div/button";
    //智慧仓储
    private static String warehouseSystem = "//*[@id=\"app\"]/div/div[2]/div[2]/a/div";




    //基础管理
    private static String basicManagement = "//*[@id=\"app\"]/div/div[1]/div/div[1]/div/ul/div[2]/li/div";


    public static String getUserCenterUrl() {
        return userCenterUrl;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUCLoginButton() {
        return UCLoginButton;
    }

    public static String getWarehouseSystem() {
        return warehouseSystem;
    }

    public static String getBasicManagement() {
        return basicManagement;
    }
}
