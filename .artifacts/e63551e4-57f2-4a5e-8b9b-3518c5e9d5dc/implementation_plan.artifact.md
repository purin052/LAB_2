# Fix ChecklistNote and related compilation errors

The project has several compilation errors centered around `ChekListNote.java` and its base class `Note.java`. The primary error is a constructor name mismatch in `ChekListNote.java`, but there are also secondary issues with field visibility, missing fields, and incorrect method signatures.

## User Review Required

> [!NOTE]
> I am keeping the filename as `ChekListNote.java` to match the project structure, but I will fix the class and constructor names to be consistent.
> I will also fix `Note.java` and `User.java` to resolve underlying issues that would prevent the app from compiling even after fixing `ChekListNote.java`.

## Proposed Changes

### Core Models

#### [MODIFY] [Note.java](file:///D:/LAB_2/LAB_2-master/app/src/main/java/com/example/lab_2/Note.java)
- Add missing `user` field.
- Fix `getUser()` to return the `user` field instead of the `User` class.
- Fix `setUser()` to correctly assign the parameter to the field.

#### [MODIFY] [User.java](file:///D:/LAB_2/LAB_2-master/app/src/main/java/com/example/lab_2/User.java)
- Make `getUserName()` and `setUserName()` public to ensure they can be accessed from any context where a `User` object is available.

#### [MODIFY] [ChekListNote.java](file:///D:/LAB_2/LAB_2-master/app/src/main/java/com/example/lab_2/ChekListNote.java)
- Fix the constructor name to match the class name (`ChekListNote`).
- Fix `getSummary()` to return a `String` (as required by the abstract method in `Note`) and use the correct `getUser()` and `getUserName()` methods.
- Fix field naming consistency (`CheckList` to `checkList`).
- Remove the invalid `super(...)` call as `Note` does not have a matching constructor.
- Fix syntax errors (like the extra closing brace).

## Verification Plan

### Automated Tests
- Run `./gradlew :app:compileDebugJavaWithJavac` to verify that the project compiles without errors.

### Manual Verification
- None required as these are purely structural and syntax fixes.
