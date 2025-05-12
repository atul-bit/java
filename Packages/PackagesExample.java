/**
    Package is a folder in java which contains all tha class files and interfaces files, which can be used/reused in a single project.
    To import other class file form a given package we use the keyword import along with file name.
    import PACKAGE_NAME.CLASS_NAME
    example : import myPackage.MyClass
    import PACKAGE_NAME.* will load all the files of the given package.
    if you have a nested package, then you have to give the exact path of the folder/package of that file.
*/

package Packages;
import Inheritence.Animal;

public class PackagesExample {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.eat();
    }
}
