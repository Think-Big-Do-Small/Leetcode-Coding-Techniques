![GithubHeader](https://user-images.githubusercontent.com/37477845/92315782-e1255d80-f025-11ea-80e0-e62fc08c7a1e.gif)


## Leetcode-Coding-Techniques


<details open> 
<summary>第1-100题</summary>

- [第1题](#)

- [第2题](#)

- [第3题](#)


- [第21题：合并两个有序链表](https://github.com/Think-Big-Do-Small/Leetcode-Coding-Techniques/tree/main/0021.%20%E5%90%88%E5%B9%B6%E4%B8%A4%E4%B8%AA%E6%9C%89%E5%BA%8F%E9%93%BE%E8%A1%A8)

Java Version: <br>

```bash
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (null == list1) return list2; 
        if (null == list2) return list1; 
        ListNode l1 = list1;
        ListNode l2 = list2; 
        ListNode l3 = null; 
        /* assign new head */
        if (l1.val < l2.val) {
            l3 = l1; l1 = l1.next; 
        } else {
            l3 = l2; l2 = l2.next; 
        }
        ListNode l3Mov = l3; 
        /* move to next */
        while ((null != l1) && (null != l2)) {
            if(l1.val < l2.val) {
                l3Mov.next = l1; l3Mov = l3Mov.next; l1 = l1.next;
            } else {
                l3Mov.next = l2; l3Mov = l3Mov.next; l2 = l2.next; 
            }
        }
        while (null != l1) {
            l3Mov.next = l1; l3Mov = l3Mov.next; l1 = l1.next;
        }
        while (null != l2) {
            l3Mov.next = l2; l3Mov = l3Mov.next; l2 = l2.next; 
        }
        l3Mov.next = null; 
        return l3; 
    }
}

```
Cpp Version <br>
```bash
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (nullptr == list1) return list2; 
        if (nullptr == list2) return list1; 
        ListNode * l1 = list1; 
        ListNode * l2 = list2; 
        ListNode * l3 = nullptr; 
        /* assign new head */ 
        if (l1->val < l2->val) {
            l3 = l1; l1 = l1->next; 
        } else {
            l3 = l2; l2 = l2->next; 
        }
        /* move next */ 
        ListNode * l3Mov = l3; 
        while ((nullptr != l1) && (nullptr != l2)) {
            if(l1->val < l2->val) {
                l3Mov->next = l1; l3Mov = l3Mov->next; l1 = l1->next; 
            } else {
                l3Mov->next = l2; l3Mov = l3Mov->next; l2 = l2->next; 
            }
        }
        /* l1 left */ 
        while (nullptr != l1) {
            l3Mov->next = l1; l3Mov = l3Mov->next; l1 = l1->next; 
        }
        /* l2 left */ 
        while (nullptr != l2) {
            l3Mov->next = l2; l3Mov = l3Mov->next; l2 = l2->next; 
        }
        l3Mov->next = nullptr; 
        return l3; 
    }
};
```

- [第2题：两数相乘]()





</details>

<details open>
<summary>第101-200题</summary>
    
- [第101题](#) 
    
- [第102题](#) 

</details>


<details open>
<summary>第201-300题</summary>
    
- [第201题](#) 
    
- [第202题](#) 

    
</details>

## About Me 
- Computer Science, Master, Shenzhen University
- I am a software engineer 
- I am familar with computer languages, like c++,java,python,c,matlab,html,css,jquery
- I am familar with databases such as mysql, postgresql
- I am familar with flask, apache tomcat
- I am familar with libraries opencv, caffe, keras, tensorflow, openvino
- I am familar with gpu libraries like cuda, cudnn
- I am recently doing some image segmentation projects with c++, python and cuda <br> background matting etc. <br> 

## Software Development Experience

- [兔子找回(Rabbit Finder)](www.aizaozhidao.vip/tuzizhaohui) <br>
- smart file packaging with high speed and efficiency

- [图标助手(Icon Maker)](www.aizaozhidao.vip/icon-maker) <br>
- image to icon with just one simple mouse click!


<br>

<img src="https://img.shields.io/badge/C Lang-222222.svg?logo=c&style=flat"> <img src="https://img.shields.io/badge/C++-00599C.svg?logo=c%2B%2B&style=flat"> <img src="https://img.shields.io/badge/C%23-239120.svg?logo=C%20Sharp&style=flat"> <img src="https://img.shields.io/badge/Python-f9d64e.svg?logo=python&style=flat"> <img src="https://img.shields.io/badge/Julia-a577bd.svg?logo=julia&style=flat"> <img src="https://img.shields.io/badge/MATLAB-0076A8.svg?logo=mathworks&style=flat"> <img src="https://img.shields.io/badge/HTML5-222222.svg?logo=html5&style=flat">
 <img src="https://img.shields.io/badge/CSS3-1572B6.svg?logo=css3&style=flat"> <img src="https://img.shields.io/badge/javascript-3577c4.svg?logo=javascript&style=flat"> <img src="https://img.shields.io/badge/TesorFlow-aa4c00.svg?logo=tensorflow&style=flat"> <img src="https://img.shields.io/badge/PyTorch-aa381e.svg?logo=pytorch&style=flat"> <img src="https://img.shields.io/badge/OpenCV-FF0000.svg?logo=opencv&style=flat"> <img src="https://img.shields.io/badge/Qt-AAAAAA.svg?logo=qt&style=flat"> <img src="https://img.shields.io/badge/Raspberry%20Pi-C51A4A.svg?logo=Raspberry%20Pi&style=flat"> <img src="https://img.shields.io/badge/Arduino-AAAAAA.svg?logo=Arduino&style=flat"> <img src="https://img.shields.io/badge/PowerPoint-B7472A.svg?logo=Microsoft%20PowerPoint&style=flat"> <img src="https://img.shields.io/badge/Prezi-AAAAAA.svg?logo=prezi&style=flat"> <img src="https://img.shields.io/badge/Unity-000000.svg?logo=unity&style=flat"> <img src="https://img.shields.io/badge/Android-AAAAAA.svg?logo=android&style=flat"> <img src="https://img.shields.io/badge/Amazon%20AWS-232F3E.svg?logo=Amazon%20AWS&style=flat"> <img src="https://img.shields.io/badge/Microsoft%20Azure-00a5ff.svg?logo=Microsoft%20Azure&style=flat"> <img src="https://img.shields.io/badge/-Google%20Cloud-AAAAAA.svg?logo=google-cloud&style=flat"> <img src="https://img.shields.io/badge/IBM%20Cloud-000000.svg?logo=IBM%20Cloud&style=flat"> <img src="https://img.shields.io/badge/Salesforce-00bafc.svg?logo=Salesforce&style=flat"> <img src="https://img.shields.io/badge/Kaggle-21eaff.svg?logo=kaggle&style=flat"> <img src="https://img.shields.io/badge/-Docker-AAAAAA.svg?logo=docker&style=flat"> [![My Qiita posts](https://qiita-badge.apiapi.app/s/Kazuhito/posts.svg)](http://qiita.com/Kazuhito)


![GithubHeader2](https://user-images.githubusercontent.com/37477845/92398696-07e9ae00-f164-11ea-9f4f-42df807a6218.gif)
