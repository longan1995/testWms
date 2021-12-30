package element.basicManagement;

public class warehouseManagement {
    //仓库管理页面
    private static String warehouseHtml = "//*[@id=\"app\"]/div/div[1]/div/div[1]/div/ul/div[2]/li/ul/div[1]/a/li";
    //仓库编号
    private static String warehouseNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/form/div[1]/div/div/input";
    //仓库名称
    private static String warehouseName = "";
    //所属品牌
    private static String belongBrand = "";
    //仓库状态
    private static String warehouseState = "";
    //创建人
    private static String founder = "";
    //创建时间
    private static String createTime = "";
    private static String  chooseCreateTime = "";
    //创建时间
    private static String finishTime = "";
    private static String  choosefinishTime = "";

    //搜索按钮
    private static String searchButton = "";
    //重置
    private static String resetButton = "";


    //新增
    private static String newButton  = "";

    //窗口取消按键、关闭
    private static String windowCancel = "";
    private static String windowQuit = "";
    //仓库编号
    private static String warehouseNum_new = "";
    //仓库名称
    private static String warehouseName_new = "";
    //仓库类型
    private static String warehouseType = "";
    private static String chooseWarehouseType = "";
    //所属品牌
    private static String belongBrand_new = "";
    private static String chooseBelongBrand_new = "";
    //仓库状态
    private static String warehouseState_new = "";
    //备注
    private static String remarks_new = "";

    //窗口确认
    private static String windowComfirm = "";

    //单据选择
    private static String voucherPick = "";

    //编辑按钮
    private static String voucherEidt = "";

    //导出
    private static String voucherExport = "";

    //修改
    private static String  modify = "";


    public static String getWarehouseHtml() {
        return warehouseHtml;
    }

    public static String getWarehouseNum() {
        return warehouseNum;
    }

    public static String getWarehouseName() {
        return warehouseName;
    }

    public static String getBelongBrand() {
        return belongBrand;
    }

    public static String getWarehouseState() {
        return warehouseState;
    }

    public static String getFounder() {
        return founder;
    }

    public static String getCreateTime() {
        return createTime;
    }

    public static String getChooseCreateTime() {
        return chooseCreateTime;
    }

    public static String getFinishTime() {
        return finishTime;
    }

    public static String getChoosefinishTime() {
        return choosefinishTime;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getNewButton() {
        return newButton;
    }

    public static String getWindowCancel() {
        return windowCancel;
    }

    public static String getWindowQuit() {
        return windowQuit;
    }

    public static String getWarehouseNum_new() {
        return warehouseNum_new;
    }

    public static String getWarehouseName_new() {
        return warehouseName_new;
    }

    public static String getWarehouseType() {
        return warehouseType;
    }

    public static String getChooseWarehouseType() {
        return chooseWarehouseType;
    }

    public static String getBelongBrand_new() {
        return belongBrand_new;
    }

    public static String getChooseBelongBrand_new() {
        return chooseBelongBrand_new;
    }

    public static String getWarehouseState_new() {
        return warehouseState_new;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getWindowComfirm() {
        return windowComfirm;
    }

    public static String getVoucherPick() {
        return voucherPick;
    }

    public static String getVoucherEidt() {
        return voucherEidt;
    }

    public static String getVoucherExport() {
        return voucherExport;
    }

    public static String getModify() {
        return modify;
    }
}
