FULLPATH=$(cd "$(dirname "$0")"; pwd)/$1
  
echo "start server: $FULLPATH"

JVMARGS=" -Dfile.encoding=UTF-8 "

ENV=$2
if [ ! -n "$2" ] ;then
    echo "you have not input a env! use dev!!!!"
    ENV=dev
fi


echo "nohup java -Denv=$ENV $JVMARGS -jar $FULLPATH --spring.profiles.active=$ENV 1>/dev/null 2>$FULLPATH.error.log &"

nohup java -Denv=$ENV $JVMARGS -jar $FULLPATH --spring.profiles.active=$ENV 1>/dev/null 2>$FULLPATH.error.log &