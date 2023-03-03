# วิธีการใช้งาน
1. ให้เช็คว่าเครื่องที่จะ run มี Java Kit (JDK) เรียบร้อนแล้ว<br>
2. javac ไฟล์ Start.java แล้ว run โปรแกรมขึ้นมา<br>
3. กำหนดค่า N แล้วจะมี menu ฟังช์ชั่นต่างๆของโปรแกรมดังนี้<br>

Select -1 : RESET INPUT   -->เป็นการลบข้อมูลทั้งหมดของนักเรียนทิ้งแล้วจะสามารถแอดชื่อเข้ามาไหม่ได้<br>
Select  0 : ADD STUDENT   --> แอดนักเรียนผ่านชื่อที่เป็นString ทีละคน จะไม่สามารถแอดได้ถ้านักเรียนเต็ม<br>
Select  1 : SHOW ALL STUDENTS --> โชว์นักเรียนทั้งหมด<br>
Select  2 : SHOW STUDENTS IN GRYFFINDOR  --> โชว์นักเรียนทั้งหมดในบ้่าน GRYFFINDOR<br>
Select  3 : SHOW STUDENTS IN HUFFLEPUFF  --> โชว์นักเรียนทั้งหมดในบ้่าน HUFFLEPUFF<br>
Select  4 : SHOW STUDENTS IN RAVENCLAW  --> โชว์นักเรียนทั้งหมดในบ้่าน RAVENCLAW<br>
Select  5 : SHOW STUDENTS IN SLYTHERIN  --> โชว์นักเรียนทั้งหมดในบ้่าน SLYTHERIN<br>
Select  6 : NUMBER OF STUDENTS  -->โชว์จำนวนนักเรียนทั้งหมดและจำนวนนักเรียนของแต่ละบ้าน<br>
Select  7 : MULTIPLE ADD STUDENT  --> แอดนักเรียนหลายคนจนครบจำนวน<br>
Select  8 : SELECT PROFILE BY NAME --> ดูโปรไฟล์นักเรียนผ่่าน ชื่อ ของนักเรียน<br>
Select  9 : STOP PROGRAM --> จบโปรแกรม<br>


# การทำงานของแต่ละไฟล์

Start  --> คือไฟล์main ในการรันโปรแกรม<br>
The_Sorting_Hat --> คือไฟล์ที่จำลอง หมวกสุ่มบ้านใน hogwarts จะทำการ return model ของแต่ละบ้านอย่างสมดุล<br>
model --> เป็นโฟลเดอร์ที่เก็บ model ของแต่ละบ้านไว้<br>
