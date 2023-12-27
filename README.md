# scripts
useful scripts

# Mac
Clone.

```
cd ~
git clone https://github.com/jinwoo-jeon0/scripts.git (cloned-directory)
```
Add the cloned directory to $PATH.

Open a file.
```
sudo vi /etc/path.d/$(any-name)
```
Add the cloned directory to the file.
```
(cloned-directory)/scripts
```

# Windows (git-bash)

```sh
# ~/.bashrc
source ${cloned_path}/aliases-for-git-bash
```
