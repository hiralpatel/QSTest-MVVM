package com.qstest.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\tj\b\u0012\u0004\u0012\u00020\u0018`\u000fJ \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/qstest/viewmodel/ProductsViewModel;", "Landroidx/lifecycle/ViewModel;", "productsRepository", "Lcom/qstest/repository/ProductsRepository;", "coroutineDispatchersProvider", "Lcom/qstest/utils/CoroutineDispatchersProvider;", "(Lcom/qstest/repository/ProductsRepository;Lcom/qstest/utils/CoroutineDispatchersProvider;)V", "_allProduct", "Lcom/qstest/utils/SingleLiveData;", "Ljava/util/ArrayList;", "Lcom/qstest/model/Product;", "_event", "Lcom/qstest/viewmodel/ProductEvent;", "allProduct", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getAllProduct", "()Landroidx/lifecycle/LiveData;", "event", "getEvent", "getIDs", "", "getProduct", "productIDs", "", "getProductFromDB", "refDB", "Lcom/google/firebase/database/DatabaseReference;", "ID", "key", "handleError", "state", "Lcom/qstest/model/ErrorState;", "handleProductIDsApiSuccess", "response", "Lcom/qstest/model/AllProductsIDs;", "app_debug"})
public final class ProductsViewModel extends androidx.lifecycle.ViewModel {
    private final com.qstest.repository.ProductsRepository productsRepository = null;
    private final com.qstest.utils.CoroutineDispatchersProvider coroutineDispatchersProvider = null;
    private final com.qstest.utils.SingleLiveData<java.util.ArrayList<com.qstest.model.Product>> _allProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.qstest.model.Product>> allProduct = null;
    private final com.qstest.utils.SingleLiveData<com.qstest.viewmodel.ProductEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.qstest.viewmodel.ProductEvent> event = null;
    
    public ProductsViewModel(@org.jetbrains.annotations.NotNull()
    com.qstest.repository.ProductsRepository productsRepository, @org.jetbrains.annotations.NotNull()
    com.qstest.utils.CoroutineDispatchersProvider coroutineDispatchersProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.qstest.model.Product>> getAllProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.qstest.viewmodel.ProductEvent> getEvent() {
        return null;
    }
    
    public final void getIDs() {
    }
    
    public final void getProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> productIDs) {
    }
    
    private final void getProductFromDB(com.google.firebase.database.DatabaseReference refDB, java.lang.String ID, java.lang.String key) {
    }
    
    private final void handleProductIDsApiSuccess(com.qstest.model.AllProductsIDs response) {
    }
    
    private final void handleError(com.qstest.model.ErrorState state) {
    }
}