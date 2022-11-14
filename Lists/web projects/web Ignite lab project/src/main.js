import "./css/index.css"
import IMask from "imask"

const ccBgColor01 = document.querySelector(".cc-bg svg > g g:nth-child(1) path")
const ccBgColor02 = document.querySelector(".cc-bg svg > g g:nth-child(2) path")
const ccLogo = document.querySelector(".cc-logo span:nth-child(2) img")

function setCardType(type){

}

globalThis.setCardType = setCardType

const securityCode = document.querySelector('#security-code')
const securityCodePattern = {
    mask: "0000"
}

const expirationDate = document.querySelector("#experation-date")
const expirationDatePattern = {
    mask: "MM{/}YY",
    blocks: {
        MM: {
            mask: IMask.maskedRange,
            from: 1,
            to: 12,
        },
        
        YY: {
            mask: IMask.maskedRange,
            from: String(new Date().getFullYear()).slice(2),
            to: string(new Date().getFullYear() + 10).slice(2),
        },
    },
}
 
const expirationDateMasked = IMask(expirationDate, expirationDatePattern) 

const numberPatter = {
    mask: [
        {
            mask: "0000 0000 0000 0000",
            regex: /^4d{0, 15}/,
            cardtype: "visa",
        },

        {
            mask: "0000 0000 0000 0000",
            regex: /(^5[1-5]\d{0,2}|^22[2-9]\d|^2[3-7]\d{0,2})\d{0,12}/,
            cardtype: "mastercard",
        },

        {
            mask: "0000 0000 0000 0000",
            cardtype: "default",
        },
    ],

    dispatch: function (appended, dynamicMasked){
        const number = (dynamicMasked + appended).replace(/\D/g, "")
        const foundMask = dynamicMasked.compiledMasksk.find(function (item) {
            return number.match(item.regex)
        })

        return foundMask
    },
}

const cardNumberMasked = IMask(cardNumber, numberPatter)
const addButton = document.querySelector("#add-card")
addButton.addEventListener("click", () => {
    alert("cartão adicionado!")
})

document.querySelector("form").addEventListener("submit", (event) => {
    event.preventDefault()
})

const cardHolder = document.querySelector("#card-holder")
cardHolder.addEventListener("input", () => {
    const ccHolder = document.querySelector(".cc-holder .value")
    ccHolder.innerText = cardHolder.value.length === 0 ? "FULANO DA SILVA" : cardHolder.value
})

securityCodeMasked.on("accept", () =>{
    updateSecurityCode(securityCodeMasked.value);
})

function updateSecurityCode(code){
    const ccSecurity = document.querySelector(".cc-security .value")
    ccSecurity.innerText = code.length === 0 ? "123" : code
}

cardNumberMasked.on("accept", () => {
    updateCardNumber(cardNumberMasked.value);
})

function updateCardNumber(number){
    const ccNumber = document.querySelector(".cc-number")
    ccNumber.innerText = number.length === 0 ? "1234 5678 9012 3456" : number
}