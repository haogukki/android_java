#### 使用git中遇到过的问题集锦
##### P1
**Unable to create ‘project_path/.git/index.lock’: File exists. exists**
```c
在.git同级目录，执行rm -f .git/index.lock （或者rm -f git/index.lock） 删除后可提交。成功！
```
##### p2
**fatal: remote origin already exists.解决方法**
```c
problems:
git remote add origin git@github.com:abc/fgh.git
fatal: remote origin already exists.（报错远程起源已经存在。）
```
```c
先输入 git remote rm origin
再输入 git remote add origin git@github.com:abc/fgh.git
```
##### P3
**#Warning: Permanently added the RSA host key for IP address '52.74.223.119'**
在git bash终端输入`ssh -T git@github.com`验证与github是否连接成功.

##### P4
**“You've sucessfully authenticated, but github dose not provide shell access”**
**"fatal: refusing to merge unrelated histories"**
- ```shell
  - `git pull origin master --allow-unrelated-histories #加上后面这个选项允许不相关历史提交`
  - `git push origin master #提交到远程分支`
  ```
- ```shell
  直接将`GitHub`的`ssh key`删除掉，然后重新生成一份新的
  ```
##### P5

unable to access 'https://github.com/用户名/仓库名.git/': SSL certificate problem: self

意思：Fisheye/Crucible服务器不能识别git的SSL证书，所以操作停止执行

```shell
git config --global http.sslVerify false
```

#####  P6

could not read from remote repository

```shell
ssh-keygen -t rsa -C "email@wmail.com"
//生成密钥后粘贴到github
```

##### P7

origin does not to be a git repository

```
git remote add origin git@github.com:yourusername/test.git
git push -u origin master
```

##### P8

github仓库代码在别的机器上更新了，怎么同步到另一台机器

```shell
git pull master//从远端仓库拉取最新的项目版本
git status//查看当前工作状态
```

#### GIT命令

##### git add
**git add .** ：他会监控工作区的状态树，使用它会把工作时的**所有变化提交**到暂存区，包括文件内容修改(modified)以及新文件(new)，但不包括被删除的文件。
**git add -u** ：他仅监控**已经被add的文件**（即tracked file），他会将被修改的文件提交到暂存区。add -u 不会提交新文件（untracked file）。（git add --update的缩写）
**git add -A** ：是上面两个功能的合集（git add --all的缩写）
##### git commit
**git commit -a:** commit all changed files
**git commit -m "aaa":** commit wit a message

##### git pull

用于从远程获取代码并合并本地的版本

**git pull orgin master: ** 从master分支与本地仓库同步

##### git remote

**git remote -v:**查看远程分支版本 



