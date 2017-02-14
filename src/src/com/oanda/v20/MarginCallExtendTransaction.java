package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarginCallExtendTransaction is created when the margin call state for an
* Account has been extended.
*/

public class MarginCallExtendTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public MarginCallExtendTransaction set_id(String __id) { 
        this._id = new TransactionID(__id); 
        return this;
    }
    /**
    * The Transaction's Identifier.
    */

    public String get_id() {
        return this._id.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public MarginCallExtendTransaction set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Transaction was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("userID") private Integer _userID;
    public MarginCallExtendTransaction set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The ID of the user that initiated the creation of the Transaction.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("accountID") private AccountID _accountID;
    public MarginCallExtendTransaction set_accountID(String __accountID) { 
        this._accountID = new AccountID(__accountID); 
        return this;
    }
    /**
    * The ID of the Account the Transaction was created for.
    */

    public String get_accountID() {
        return this._accountID.get_AccountID();
    }

    @SerializedName("batchID") private TransactionID _batchID;
    public MarginCallExtendTransaction set_batchID(String __batchID) { 
        this._batchID = new TransactionID(__batchID); 
        return this;
    }
    /**
    * The ID of the "batch" that the Transaction belongs to. Transactions in
    * the same batch are applied to the Account simultaneously.
    */

    public String get_batchID() {
        return this._batchID.get_TransactionID();
    }

    @SerializedName("requestID") private RequestID _requestID;
    public MarginCallExtendTransaction set_requestID(String __requestID) { 
        this._requestID = new RequestID(__requestID); 
        return this;
    }
    /**
    * The Request ID of the Account Control Request which generated the
    * transaction (only provided for Transactions created by a Client request)
    */

    public String get_requestID() {
        return this._requestID.get_RequestID();
    }

    @SerializedName("type") private TransactionType _type = TransactionType.MARGIN_CALL_EXTEND;
    /**
    * The Type of the Transaction. Always set to "MARGIN_CALL_EXTEND" for an
    * MarginCallExtendTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("extensionNumber") private Integer _extensionNumber;
    public MarginCallExtendTransaction set_extensionNumber(int __extensionNumber) {
        this._extensionNumber = __extensionNumber;
        return this;
    }
    /**
    * The number of the extensions to the Account's current margin call that
    * have been applied. This value will be set to 1 for the first
    * MarginCallExtend Transaction
    */

    public int get_extensionNumber() {
        return this._extensionNumber;
    }
}