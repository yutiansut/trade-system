package ai.techfin.xtpms.service.broker.dto;

import ai.techfin.tradesystem.domain.enums.MarketType;
import ai.techfin.tradesystem.domain.enums.OrderStatusType;
import ai.techfin.tradesystem.domain.enums.PriceType;
import ai.techfin.tradesystem.domain.enums.SideType;

import java.io.Serializable;
import java.util.List;

public class OrderResponseDTO implements Serializable {

    private String placementId;

    private String user;

    private String ticker;

    private MarketType marketType;

    private String errorId;

    private String errorMsg;

    private double price;

    private long quantity;

    private PriceType priceType;

    private SideType sideType;
    /**
     * 订单状态
     */
    private OrderStatusType statusType;


    public String getPlacementId() {
        return placementId;
    }

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public MarketType getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public PriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public SideType getSideType() {
        return sideType;
    }

    public void setSideType(SideType sideType) {
        this.sideType = sideType;
    }

    public OrderStatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(OrderStatusType statusType) {
        this.statusType = statusType;
    }

    @Override
    public String toString() {
        return "OrderResponseDTO{" +
                "placementId='" + placementId + '\'' +
                ", user='" + user + '\'' +
                ", ticker='" + ticker + '\'' +
                ", marketType=" + marketType +
                ", errorId='" + errorId + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", priceType=" + priceType +
                ", sideType=" + sideType +
                ", statusType=" + statusType +
                '}';
    }

    public OrderResponseDTO() {
    }
}
