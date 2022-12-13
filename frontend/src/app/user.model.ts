export class User {
  name : string;
  age : number;
  joinDate : Date;
  profilePicture: any = "assets/user.png";
  location: any = "near you";
  hobby: any= "climbing";
  constructor(name: string, age : number, joinDate : Date) {
    this.name = name;
    this.age = age;
    this.joinDate  = joinDate;
  }
}
