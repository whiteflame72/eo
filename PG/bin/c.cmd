set USERID=jtan
set SVNBIN="C:\Program Files\SlikSvn\bin"
set PATH=%SVNBIN%

REM  (1) On his Windows NT workstation (XP, Vista, or 7), he
REM      should open up a Microsoft Windows Command
REM      Prompt window.  This workstation must have an
REM      SVN client program installed.  He may use Subclipse
REM      if he desires for the SVN operations, but I have documented
REM      the precise steps required using a command line client.

REM  (2)    C> 
c:
cd C:\


REM  (3)    C:\> 
mkdir C:\test\%USERID%

REM  (4)    C:\>
cd C:\test
pause

REM  (5)    C:\test> 
rd /S/Q %USERID%
:pause

svn checkout svn://192.168.25.200:22225/%USERID%
REM latest is Checked out revision 1583.
pause

REM         This will create the following directories:
REM              C:\test\%USERID%
REM              C:\test\%USERID%\EolMainProject    ... and its subdirectories


REM  (6)    C:\test> 
cd %USERID%\EolMainProject

REM  (7)    Copy his changes from his current work area into
REM        the corresponding place in C:\test\%USERID%\EolMainProject.
:xcopy /e "C:\Users\james\Workspaces\Eclipse 3.4 Java\EolSecondPageSProject" .

REM  (8)    Perform svn add on each of his new files and directories
REM        inside of C:\test\%USERID%\EolMainProject in this manner:

:svn add EolWebSite
:svn mkdir EolWebSite
:svn update EolCommon
:svn update EolData
:svn update EolServices

REM  (9)   Perform a complete build on his code to make sure
REM       it compiles properly from this location.
:ant build

REM  (10) Run this build to make sure it runs properly.

REM  (11) Check in all code from C:\test\%USERID%\EolMainProject into
REM the /%USERID%/EolMainProject repository area with
REM        the following commands:

REM        C>  cd C:\test\%USERID%\EolMainProject
REM        C:\test\%USERID%\EolMainProject> 
:svn commit -m "Initial checkin based on the common build"