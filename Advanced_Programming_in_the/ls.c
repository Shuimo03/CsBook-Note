#include "apue.h"
#include <dirent.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc,char *argv[]){

    DIR *dp;
    struct dirent *dirp;

    if(argc != 2){
        err_quit("usage: ls directory_name");
    }

    if((dp = opendir(argv[1])) == NULL){
        eff_sys("can't open %s",argv[1]);
    }
    
    while ((dirp = readdir(dp)) != NULL){
        printf("%s\n",dirp->d_name);
    }

    closedir(dp);
    exit(0); //0表示成功,1-255表示错误。

}