# doczilla_task1
This application can find all files with file extension: ".txt", ".doc", ".docx", 
sort by name and create a concatenation file.
If you want to choose folder for searching, 
you have to write path-name in field "selectFolder"(class: StartApplication).
If you want to change file-result location, 
you have to write path-name in fields "pathOfResultDirectory" and "pathOfResultFile" (class: CreateFile).
If you want add file extensions, 
you have to add them in method "visitFile" (class: MyFileVisitor).
Point of start is "StartApplication"
