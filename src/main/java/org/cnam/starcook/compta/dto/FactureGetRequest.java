package org.cnam.starcook.compta.dto;

public class FactureGetRequest {

    public long id;

    public FactureGetRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
