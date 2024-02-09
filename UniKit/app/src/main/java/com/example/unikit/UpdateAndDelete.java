package com.example.unikit;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"},
        d2 = {"Lcom/example/unikit/UpdateAndDelete;", "", "modifyItem", "", "itemUID", "", "isDone", "", "onItemDelete", "app_debug"}
)
public interface UpdateAndDelete {
   void modifyItem(@NotNull String var1, boolean var2);

   void onItemDelete(@NotNull String var1);
}
