var cs = document.querySelectorAll(".cs");

for (let i = 0; i < cs.length; i++)
{
    const subject = document.querySelector(".subj");
    const professor = document.querySelector(".prof");
    cs[i].id = i;
    cs[i].addEventListener("onclick", ()=>{
        subject.textContent = "Subject: Computational Statistics";
        professor.textContent = "Teacher: Dr. B.Srinivasa Rao"
    })
}
