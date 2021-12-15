package com.qstest.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/qstest/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/qstest/databinding/ActivityMainBinding;", "productAdapter", "Lcom/qstest/view/adapter/ProductAdapter;", "viewModel", "Lcom/qstest/viewmodel/ProductsViewModel;", "getViewModel", "()Lcom/qstest/viewmodel/ProductsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getProduct", "", "productIDs", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "handleEvent", "event", "Lcom/qstest/viewmodel/ProductEvent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.qstest.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qstest.view.adapter.ProductAdapter productAdapter;
    
    public MainActivity() {
        super();
    }
    
    private final com.qstest.viewmodel.ProductsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleEvent(com.qstest.viewmodel.ProductEvent event) {
    }
    
    private final void getProduct(java.util.ArrayList<java.lang.String> productIDs) {
    }
}