@echo off
setlocal enabledelayedexpansion

set CLIP_BOARD=
for /f "usebackq tokens=*" %%i in (`java PrintClipboardString`) do (
    set CLIP_BOARD=!CLIP_BOARD!^
%%i
)
echo =============
echo  input
echo =============
echo !CLIP_BOARD!
echo.

echo =============
echo  output
echo =============
echo !CLIP_BOARD! | jshell
echo.

pause
