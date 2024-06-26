=====================================
Project 1 README ID: 410410008
=====================================

系統環境: WSL, Ubuntu 22.04

-------------------------------------
1. 編譯語法分析器
-------------------------------------

請依照以下步驟
1. 開啟終端機。
2. 移動到包含語法分析器文法文件（`mylexer.g`）的目錄。
3. 執行 'make' 命令編譯語法分析器

-------------------------------------
2. 測試語法分析器
-------------------------------------

要測試語法分析器，您可以使用提供的測試文件。請按照以下步驟進行操作：

1. 確保語法分析器已經編譯（如果尚未編譯，請先運行 `make`）。
2. 運行以下命令以使用 `example1.c` 測試語法分析器：

make test1

此命令將在 `example1.c` 上執行語法分析器並顯示生成的標記。

您也可以使用 `make test2`、`make test3` 等命令使用其他測試文件測試語法分析器。

-------------------------------------
附加注意事項
-------------------------------------

- 在執行編譯和測試命令之前，請確保系統已安裝 Java(JDK) 和 ANTLR (ANTLR.jar已經隨附於該目錄，應該能正常運行)