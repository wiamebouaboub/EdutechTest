export default class Paire {
    constructor (id, question, reponse) {
    this._id = id;
    this._question = question;
    this._reponse = reponse;
    }
    get id() {
        return this._id;
        }
    get question() {
    return this._question;
    }
    get reponse() {
    return this._reponse;
    }
   }