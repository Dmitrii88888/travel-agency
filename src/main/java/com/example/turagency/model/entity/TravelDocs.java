package com.example.turagency.model.entity;

import java.util.StringJoiner;

public class TravelDocs extends Entity {
    private String voucher;
    private String insurance;
    private String ticket;

    public TravelDocs() {
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TravelDocs that = (TravelDocs) o;
        if (voucher != null ? !voucher.equals(that.voucher) : that.voucher != null) return false;
        if (insurance != null ? !insurance.equals(that.insurance) : that.insurance != null) return false;
        return ticket != null ? ticket.equals(that.ticket) : that.ticket == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (voucher != null ? voucher.hashCode() : 0);
        result = 31 * result + (insurance != null ? insurance.hashCode() : 0);
        result = 31 * result + (ticket != null ? ticket.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TravelDocs.class.getSimpleName() + "[", "]")
                .add("voucher='" + voucher + "'")
                .add("insurance='" + insurance + "'")
                .add("ticket='" + ticket + "'")
                .toString();
    }

}