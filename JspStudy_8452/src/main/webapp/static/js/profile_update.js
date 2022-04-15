const profileInputs = document.querySelectorAll(".profile-input");
const updateSubmitBtn = document.querySelector(".update-submit-btn");
const passwordUpdateBtn = document.querySelector(".password-update-btn");

const originPrincipal = {
	"name": profileInputs[0].value,
	"email": profileInputs[1].value
};

function isEmpty(str) {
	return str == "" || str == null || typeof str == "undifined";
}

updateSubmitBtn.onclick = () => {
	let name = profileInputs[0].value;
	let email = profileInputs[1].value;
	// 1. 빈값이 아니어야 한다.
	if (isEmpty(name)) {
		alert("이름을 입력해주세요.");
	} else if (isEmpty(email)) {
		alert("이메일을 입력해주세요.");
	}
	//2. 기존(originData랑 현재 data랑 변화가 있는지 체크)
	else if (originPrincipal.name == name && originPrincipal.email == email) {
		alert("수정할 정보가 없습니다.");
	} else {
		//1,2 조건이 만족되면 submit()
		document.querySelector("form").submit();
	}
}

passwordUpdateBtn.onclick = () => {
	location.href = "/JspStudy_8452/profile/update/password";
}