How to setup projects in Eclipse:

Please make sure your Eclipse have GWT Plugin 2.5+ installed;
Please using UTF-8 as project Encoding setting and New text file line delimiter using Unix, and please save your file in UTF-8 Without BOM mode;

1, Open Common.xml, update "dir.Solution.Root" value to the folder of this Readme.txt, make sure path end with "/";
2, Open Eclipse.userlibraries, replace all "$ROOT$" to the folder of this Readme.txt;
3, Using Eclipse->Window->Perferences->Java->Build Path->User Libraries->Import to import libraries;
4, Using Eclipse->File->Import->General->Existing Projects into Workspace to import projects, do not enable "Copy projects into workspace";
5, Using Eclipse->Window->Show View->Ant to open Ant view and open all build.xml in each project;
6, Build each project;
7, Update cn.softnado.Gwt.Map.Baidu.Demos.Route.client.RouteLocator.onModuleLoad, replace "Replace it with your own Baidu Key";
8, All jar will copy to Tool folder, and please ignore the error of RouteLocator. You can using ant to compile and deploy/run this project.