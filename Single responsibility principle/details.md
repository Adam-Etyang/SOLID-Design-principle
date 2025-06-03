Definition
>A class should only have one reason to change 
>



The Single Responsibility Principle states that every class should have only one responsibility or job. This means a class should only have one reason to be modified.



## Code Smells

Large Classes: Classes with many methods and fields
Mixed Concerns: Business logic mixed with data access
Multiple Import Groups: Imports from different domains (UI, database, networking)
Complex Constructors: Many dependencies injected
Generic Names: Classes named "Manager", "Handler", "Util"

## Method-Level Violations

Methods that do multiple unrelated things
Long methods with multiple sections
Methods with many parameters from different domains

## Code examples


