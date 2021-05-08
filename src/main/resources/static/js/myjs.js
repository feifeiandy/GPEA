// 需要先指定ul的id，改id唯一且css需要用到 fishbone id value
function pullData(fish,data) {
    // 判断是否为null需要测试
  try {
      var fishbone=document.getElementById(fish)
      if (data!=null)
      {
          for (const argumentsKey in data) {
              let ul=document.createElement("ul");
              ul.setAttribute("class","fishul")
              let month=data[argumentsKey].month;
              let event=data[argumentsKey].event;
              for (const ulKey in event) {
                  let li=document.createElement("li");
                  li.setAttribute("class","fishli")
                  let id=event[ulKey].id;
                  let value=event[ulKey].value;
                  li.innerHTML=id+"  "+value;
                  ul.appendChild(li);
              }
              let outli=document.createElement("li");
              outli.setAttribute("class","fishli");
              outli.appendChild(ul);
              fishbone.appendChild(outli);
          }
      }
  }
  catch (e) {
   console.log(e.messageerror)
  }
}