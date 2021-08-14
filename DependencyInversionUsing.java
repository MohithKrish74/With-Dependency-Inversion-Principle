package com.keyword;

interface Developer
{
    public void developer();
}
class Projects     //class Projects does not depend on class BackEndDevelopers and class FrontEndDevelopers.
                   // This follows Dependency Inversion Principle.
{
    public void implement(Developer develops)
    {
        develops.developer();
    }


}

class BackEndDevelopers implements Developer
{
    public void developer()
    {
        System.out.println("This is Back end Developer");
    }
}
class FrontEndDevelopers implements Developer
{
    public void developer()
    {
        System.out.println("This is Front end Developer");
    }
}
public class DependencyInversionUsing
{
    public static void main(String[] args)
    {
        Projects projects = new Projects();
        BackEndDevelopers backEndDevelopers = new BackEndDevelopers();
        FrontEndDevelopers frontEndDevelopers = new FrontEndDevelopers();
        projects.implement(backEndDevelopers);
        projects.implement(frontEndDevelopers);

    }
}
